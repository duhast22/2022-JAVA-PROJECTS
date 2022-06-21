
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection; 
import java.util.NoSuchElementException;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestLists {

	public static Collection<Object[]> LISTNUMS =
			Arrays.asList(new Object[][] { {"Linked"}, {"Array"} });
	private String listType;

	public TestLists(String listType) {
		super();
		this.listType = listType;
	}

	@Parameterized.Parameters(name = "{0}List")
	public static Collection<Object[]> bags() {
		return LISTNUMS;
	}

	private <E> MyList<E> makeList(E[] contents) {
		switch (this.listType) {
		case "Linked":
			return new LinkedGL<E>(contents);
		case "Array":
			return new ArrayGL<E>(contents);
		}
		return null;
	}

  // Don't change code above this line, it ensures the autograder works as
  // expected


  // This is a sample test; you can keep it, change it, or remove it as you like.
  // Note that it uses the method `assertArrayEquals`, which you should use to
  // test equality of arrays in this PA.
	@Test
	public void testSimpleToArray() {
		// Using the generic list to create an Integer list
		Integer[] int_input = {1, 2, 3};
		MyList<Integer> int_s = makeList(int_input);
		assertArrayEquals(int_input, int_s.toArray());
		
		// Using the generic list to create a String list
		String[] string_input = {"a", "b", "c"};
		MyList<String> string_s = makeList(string_input);
		assertArrayEquals(string_input, string_s.toArray());
	}
	
	@Test
	public void testArrayGLConstructor() {
		// Using the generic list to create a String list
		String[] string_list_1 = {"Sophia", "Anna", "Shayan", "Stanislav"};
		MyList<String> string_s = makeList(string_list_1);
		
		assertArrayEquals(string_list_1, string_s.toArray());
	}
	
	@Test
	public void testEmptyArrayGLConstructor() {
		// Using the generic list to create a String list
		String[] string_list_1 = {};
		MyList<String> string_s = makeList(string_list_1);
		
		assertArrayEquals(string_list_1, string_s.toArray());
		assertEquals(true, string_s.isEmpty());
	}
	
	@Test
	public void testNullElementsArrayGLConstructor() {
		// Using the generic list to create a String list
		String[] string_list_1 = {null, "Lydia", "pizza", null};
		MyList<String> string_s = makeList(string_list_1);
		
		assertArrayEquals(string_list_1, string_s.toArray());
	}
	
	@Test
	public void chaffAlwaysChoosesFirstArrayGL() {
		
	}
	
	@Test
	public void chaffIsEmptyReturnsTrueIfSizeGreaterThan0ArrayGL() {
		
	}
	
	@Test
	public void chaffReturnNewArrayArrayGL() {
		
	}

	@Test
	public void chaffIsEmptyReturnsFalseSizeGreaterThan3() {
		
	}
	
	@Test
	public void chaffChooseAllFailsIfLastNotChosenLinkedGL() {
		
	}
	
	@Test
	public void chaffDoWhileToArrayLinkedGL() {
		
	}
	
	@Test
	public void chaffDoWhileTransformArrayGL() {
		
	}
	
	@Test
	public void chaffFixedSizeConstructorLinkedGL() {
		
	}
	
	@Test
	public void chaffIncorrectTransformBoundsLinkedGL() {
		
	}
	
	@Test
	public void chaffIncludeNullToArrayArrayGL() {
		
	}
	
	@Test
	public void testToUpperCase() {
		String[] contents = {"a", "b", "c", "d"};
		String[] afterContents = {"A", "B", "C", "D"};
		
		MyList<String> string_s = makeList(contents);
		string_s.transformAll(new UpperCaseTransformer());
		
		assertArrayEquals(afterContents, string_s.toArray());
	}
	
	@Test
	public void testAddThree() {
		Integer[] contents = {5, 3, 1, 7, 9};
		Integer[] afterContents = {8, 6, 4, 10, 12};
		
		MyList<Integer> integer_s = makeList(contents);
		integer_s.transformAll(new AddThree());
		
		assertArrayEquals(afterContents, integer_s.toArray());
	}
	
	@Test
	public void testConcatTheWordHIPPOPOTAMUS() {
		String[] contents = {"funny", "stupid", "boring", "lazy", "dying", "fainting"};
		String[] afterContents = {"funny HIPPOPOTAMUS", "stupid HIPPOPOTAMUS", "boring HIPPOPOTAMUS", "lazy HIPPOPOTAMUS", "dying HIPPOPOTAMUS", "fainting HIPPOPOTAMUS"};
		
		MyList<String> string_s = makeList(contents);
		string_s.transformAll(new ConcatTheWordHIPPOPOTAMUS());
		
		assertArrayEquals(afterContents, string_s.toArray());
	}
	
	@Test
	public void testLongWordChooser() {
		String[] contents = {"funny", "stupid", "boring", "lazy", "dying", "fainting"};
		String[] afterContents = {"stupid", "boring", "fainting"};
		
		MyList<String> string_s = makeList(contents);
		string_s.chooseAll(new LongWordChooser());
		
		assertArrayEquals(afterContents, string_s.toArray());
	}
	
	@Test
	public void EvenNumberChooser() {
		Integer[] contents = {5, 9, 7, 0, 2, 1, 3, 2};
		Integer[] afterContents = {0, 2, 2};
		
		MyList<Integer> string_s = makeList(contents);
		string_s.chooseAll(new EvenNumberChooser());
		
		assertArrayEquals(afterContents, string_s.toArray());
	}
	
	@Test
	public void StringStartsWithS() {
		String[] contents = {"insane", "Stupid", "boring", "lazy", "dying", "Silly"};
		String[] afterContents = {"Stupid", "Silly"};
		
		MyList<String> string_s = makeList(contents);
		string_s.chooseAll(new StringStartsWithS());
		
		assertArrayEquals(afterContents, string_s.toArray());
	}
	
	@Test
	public void EvenNumberChooser2() {
		Integer[] contents = {2, 3, 5, 7, 9, 2};
		Integer[] afterContents = {2, 2};
		
		MyList<Integer> string_s = makeList(contents);
		string_s.chooseAll(new EvenNumberChooser());
		
		assertArrayEquals(afterContents, string_s.toArray());
	}
	
	
	
}