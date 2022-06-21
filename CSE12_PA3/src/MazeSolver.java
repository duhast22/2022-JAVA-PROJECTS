import java.util.ArrayList;

/* Class to implement a Maze solver */

public abstract class MazeSolver {
	
	public static Square solve(Maze maze, SearchWorklist wl) {
		Square current;
		
		wl.add(maze.start);
		maze.start.visit();
		
		while (!wl.isEmpty()) {
			current = wl.remove();
			if (current.equals(maze.finish)) {
				return current;
			}
			
			considerNeighbor(maze.contents, current, -1, 0, wl);
			considerNeighbor(maze.contents, current, 1, 0, wl);
			considerNeighbor(maze.contents, current, 0, 1, wl);
			considerNeighbor(maze.contents, current, 0, -1, wl);
			
		}
		return null;
	}
	
	//maze.contents[current.getRow()][current.getCol()]

	/* Add any helper methods you want */
	
	// Return true if the location of s, offset by rowOffset and colOffset, is in
	// bounds and not a wall, false otherwise
	public static void considerNeighbor(Square[][] contents, Square s, int rowOffset, int colOffset, SearchWorklist wl) {
		//can't be out of bounds
		int row = s.getRow() + rowOffset;
		int col = s.getCol() + colOffset;
		
		if (row < 0 || row > contents.length-1) {
			return;
		}
		if (col < 0 || col > contents[0].length-1) {
			return;
		}
		
		//can't be a wall
		if (contents[row][col].getIsWall()) {
			return;
		}
		//can't be visited
		if (contents[row][col].isVisited()) {
			return;
		}
		
		//mark the neighbor as visited
		Square neighbor = contents[row][col];
		neighbor.visit();
		//set the previous of the neighbor to current
		neighbor.setPrevious(s);
		//add the neighbor to the worklist (push or enqueue)
		wl.add(neighbor);
	}
}