/*
 * Class to implement SearchWorklist as a Stack and a Queue.
 * You can use any built-in Java collections for this class.
 */
import java.util.*;

class StackWorklist implements SearchWorklist {
	LinkedList<Square> contents = new LinkedList<>();
	
	
	public void add(Square c) {
		this.contents.push(c);
	}
	
	public Square remove() {
		return this.contents.pop();
		/*
		Square toReturn = this.contents.get(0);
		this.contents.remove(0);
		return toReturn;
		*/
	}
	
	public boolean isEmpty() {
		return this.contents.isEmpty();
	}
	
	@Override
	public String toString() {
		return "top --> " + this.contents.toString();
	}
}

class QueueWorklist implements SearchWorklist {
	Queue<Square> contents = new ArrayDeque<>();
	

	public void add(Square c) {
		this.contents.add(c);
	}
	
	public Square remove() {
		return this.contents.poll();
	}
	
	public boolean isEmpty() {
		return this.contents.isEmpty();
	}
	
	@Override
	public String toString() {
		return "front --> " + this.contents.toString() + " <-- back"; 
	}
}

public interface SearchWorklist {
	void add(Square c);
	Square remove();
	boolean isEmpty();
}
