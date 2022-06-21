import java.util.ArrayList;

/*
 * Write your JUnit tests here
 * Use the formatMaze() method to get nicer JUnit output
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSolvers {

	/* Helper method to compare two mazes */
	public void checkMaze(SearchWorklist wl, Maze startMaze, String[] expected) {
		Square s = MazeSolver.solve(startMaze, wl);
		if(expected == null) { assertNull(s); }
		else {
			ArrayList<Square> sp = startMaze.storePath();
			String actualStr = formatMaze(startMaze.showSolution(sp));
			String expectedStr = formatMaze(expected);
			assertEquals(expectedStr, actualStr);
		}
	}	

	/* Helper method to format String[] output as String */
	public String formatMaze(String[] arr) {
		String result = "";
		for (String s: arr)
			result += "\n"+s;
		return (result+"\n");
	}

	/* Add your own Worklist tests below */

	/* ************** HINT ******************** 
	 * Use the helper methods to create simple
	 * tests that are easier to debug. 
	 */
	
	
/* Worklist Tests */
	
	@Test
	public void testStackWorklist() {
		Square s1 = new Square(0,0, false);
		Square s2 = new Square(1,0, false);
		Square s3 = new Square(1,1, false);
		SearchWorklist swl = new StackWorklist();
		
		swl.add(s1);
		swl.add(s2);
		assertEquals(false, swl.isEmpty());
		
		swl.remove(); 
		swl.remove();
		assertEquals(true, swl.isEmpty());
		
		//Ensure stack behavior
		swl.add(s1);
		swl.add(s2);
		swl.add(s3);
		assertEquals(s3, swl.remove());
	}
	

	@Test
	public void testQueueWorklist() {
		Square s1 = new Square(0,0, false);
		Square s2 = new Square(1,0, false);
		Square s3 = new Square(1,1, false);
		SearchWorklist qwl = new QueueWorklist();
		
		qwl.add(s1);
		qwl.add(s2);
		assertEquals(false, qwl.isEmpty());
		
		qwl.remove(); 
		qwl.remove();
		assertEquals(true, qwl.isEmpty());
		
		//Ensure queue behavior
		qwl.add(s1);
		qwl.add(s2);
		qwl.add(s3);
		assertEquals(s1, qwl.remove());
	}	
	
	@Test
	public void testClassExample1() {
		Maze m = new Maze(new String[]{
				"#_#_",
				"____",
				"_##S",
				"F___"
			});
		String[] stackExpected = {
				"#_#_",
				"____",
				"_##S",
				"F***"
			};
		
		/* call checkMaze to solve Maze m (using a stack) with your solve method
		   and assert that the solution you get matches stackExpected */
		checkMaze(new StackWorklist(), m, stackExpected);
	}
	
	@Test
	public void testFailingOrder() {
		String[] expected = {
				"#_#_",
				"****",
				"*##S",
				"F___"
			};
		String[] actualAndWrong= {
				"#_#_",
				"____",
				"_##S",
				"F***"
			};
		assertNotEquals(formatMaze(expected), formatMaze(actualAndWrong));
	}
	
  // Test our DFS solution to the maze from discussion
	@Test
	public void testDiscussionDFS() {
		Maze m = new Maze(new String[]{
				"#___",
				"__F_",
				"S##_",
				"____"
			});
		String[] stackExpected = {
				"#___",
				"__F*",
				"S##*",
				"****"
			};
		
		/* call checkMaze to solve Maze m (using a stack) with your solve method
		   and assert that the solution you get matches stackExpected */
		checkMaze(new StackWorklist(), m, stackExpected);
	}
	
  // Test our BFS solution to the maze from discussion
	@Test
	public void testDiscussionBFS() {
		Maze m = new Maze(new String[]{
				"#___",
				"__F_",
				"S##_",
				"____"
			});
		String[] queueExpected = {
				"#___",
				"**F_",
				"S##_",
				"____"
			};
		
		/* call checkMaze to solve Maze m (using a queue) with your solve method
		   and assert that the solution you get matches queueExpected */
		checkMaze(new QueueWorklist(), m, queueExpected);
	}
	
// Test our BFS solution to the maze for all walls (Queue)
	@Test
	public void testAllWallsQueue() {
		Maze m = new Maze(new String[]{
				"####",
				"##F#",
				"S###",
				"####"
			});
		String[] queueExpected = {
				"####",
				"##F#",
				"S###",
				"####"
			};
			
		/* call checkMaze to solve Maze m (using a queue) with your solve method
			and assert that the solution you get matches queueExpected */
		checkMaze(new QueueWorklist(), m, queueExpected);
	}
	
// Test our DFS solution to the maze for all walls (Stack)
	@Test
	public void testAllWallsStack() {
		Maze m = new Maze(new String[]{
				"####",
				"##F#",
				"S###",
				"####"
			});
		String[] queueExpected = {
				"####",
				"##F#",
				"S###",
				"####"
			};
				
		/* call checkMaze to solve Maze m (using a queue) with your solve method
			and assert that the solution you get matches queueExpected */
		checkMaze(new StackWorklist(), m, queueExpected);
	}
	
// Test our BFS solution to the maze for no walls (Queue)

	@Test
	public void testNoWallsStack() {
		Maze m = new Maze(new String[]{
				"____",
				"__F_",
				"S___",
				"____"
			});
		
		String[] queueExpected = {
				"____",
				"__F_",
				"S**_",
				"____"
			};
				
		/* call checkMaze to solve Maze m (using a queue) with your solve method
			and assert that the solution you get matches queueExpected */
		checkMaze(new StackWorklist(), m, queueExpected);
	}
	

	@Test
	public void testNoWallsQueue() {
		Maze m = new Maze(new String[]{
				"____",
				"__F_",
				"S___",
				"____"
			});
		
		String[] queueExpected = {
				"____",
				"**F_",
				"S___",
				"____"
			};
				
		/* call checkMaze to solve Maze m (using a queue) with your solve method
			and assert that the solution you get matches queueExpected */
		checkMaze(new QueueWorklist(), m, queueExpected);
	}
	
// Test our BFS solution to the maze for no walls (Stack)
	@Test
	public void testNextToEachOther() {
		Maze m = new Maze(new String[]{
				"____",
				"F___",
				"S___",
				"____"
			});
		
		String[] queueExpected = {
				"____",
				"F___",
				"S___",
				"____"
			};
				
		/* call checkMaze to solve Maze m (using a queue) with your solve method
			and assert that the solution you get matches queueExpected */
		checkMaze(new StackWorklist(), m, queueExpected);
	}
	// Test our BFS solution to the maze for no walls (Stack)
		@Test
		public void testNextToEachOtherQueue() {
			Maze m = new Maze(new String[]{
					"____",
					"F___",
					"S___",
					"____"
				});
			
			String[] queueExpected = {
					"____",
					"F___",
					"S___",
					"____"
				};
					
			/* call checkMaze to solve Maze m (using a queue) with your solve method
				and assert that the solution you get matches queueExpected */
			checkMaze(new QueueWorklist(), m, queueExpected);
		}

}



