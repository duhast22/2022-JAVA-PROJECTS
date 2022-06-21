public class LinkedGL<E> implements MyList<E> {

    class Node<E>{
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
        
        public E getValue() {
        	return this.value;
        }
        
        public Node<E> getNext() {
        	return this.next;
        }
        
        public void setValue(E value) {
        	this.value = value;
        }
        
        public void setNext(Node<E> next) {
        	this.next = next;
        }
        
    }

    Node<E> front;
    int size;
    
    @SuppressWarnings("unchecked")
    public LinkedGL(E[] contents) {
    	this.size = contents.length;
    	Node<E> current = null;
    	if (this.size == 0) {
    		this.front = null;
    		return;
    	}
    	
    	for (int i = 0; i < contents.length; i++) {
    		Node<E> newNode = new Node<E>(null, null);
    		
    		if (current == null) {
    			this.front = newNode;
    		}
    		else {
    			current.next = newNode;
    		}
    		
    		current = newNode;
    		
    		current.setValue(contents[i]);
    		
    	}
    }
    
    public int size() {
    	this.size = 0;
    	Node current = this.front;
    	
    	while (current != null) {
    		size++;
    		current = current.next;
    	}
    	return size;
    }
    
    @SuppressWarnings("unchecked")  
	public E[] toArray() {
    	
    	Node<E> current = this.front;
		int currentCapacity = this.size;
    	E[] newArray = (E[]) new Object[currentCapacity];
    	
    	
    	for (int i = 0; i < currentCapacity; i++) {
    		newArray[i] = (E) current.value;
    		current = current.next;
    	}
    	
    	return newArray;
		
		
	}
    
    public E get(int index) {
    	Node<E> temp = this.front.next;
    	for (int i = 0; i < index; i+=1) {
    		temp = temp.next;
    	}
    	return temp.value;
    }

    @SuppressWarnings("unchecked")
	public void transformAll(MyTransformer mt) {
		
		Node<E> current = this.front;
		
		while (current != null) {
			
			current.value = (E) mt.transformElement(current.value);
			current = current.next;
		}
			
	}
    
    @SuppressWarnings("unchecked")
	public void chooseAll(MyChooser mc) {
    	Node<E> current = this.front;
    	Node<E> theLastOneThatWeLike = null;
    	
    	while (current != null) {
    		if (current.value == null) {
    			current = current.next;
    			continue;
    		}
    		if (mc.chooseElement(current.value) == true) {
    			if (theLastOneThatWeLike == null) {
    				this.front = current;
    			}
    			
    			else {
    			theLastOneThatWeLike.next = current;
    			}
    			
    			theLastOneThatWeLike = current;
    		}
    		current = current.next;
    	}
    	
    	if (theLastOneThatWeLike == null) {
    		this.front = null;
    	}
    	else {
    	theLastOneThatWeLike.next = null;
    	}
    	
    	this.size = size();
	}
	
	public boolean isEmpty() {
		return (this.front == null);
	}

}