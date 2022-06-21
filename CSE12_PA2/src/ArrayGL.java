
public class ArrayGL<E> implements MyList<E> {

    E[] elements;
    int size;

    
    public ArrayGL(E[] initialElements) {
        this.elements = initialElements;
        this.size = initialElements.length;
    }
    
    public void add(E s) {
    	expandCapacity();
    	this.elements[this.size] = s;
        this.size += 1;
    	
    }
    
    public E get(int index) {
        if(index < 0 || index >= this.size) {
          throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    
    public int size() {
    	
        return this.size;
    }

    
    @SuppressWarnings("unchecked")
    private void expandCapacity() {
    	int currentCapacity = this.elements.length;
        if(this.size < currentCapacity) { return; }

        // Create the new array that is twice is big
        E[] expanded = (E[]) new Object[currentCapacity * 2];

        for(int i = 0; i < this.size; i += 1) {
        	expanded[i] = this.elements[i];
        }
        this.elements = expanded;
     
    }
      
    
    @SuppressWarnings("unchecked")  
    public E[] toArray() {
    	int currentCapacity = this.elements.length;
    	E[] newArray = (E[]) new Object[currentCapacity];
    	
    	for(int i = 0; i < currentCapacity; i += 1) {
    		newArray[i] = this.elements[i];
        }
    	
    	return newArray;
    	
    }
    
    @SuppressWarnings("unchecked")
    public void transformAll(MyTransformer mt) {
    	int currentCapacity = this.elements.length;
    	E[] copy = (E[]) new Object[currentCapacity];
    	
    	for (int i = 0; i < this.size; i++) {
    		
    		if (this.elements[i] == null) {
    			continue;
    		}
    		copy[i] = (E) mt.transformElement(this.elements[i]);
    	}
    	
    	this.elements = copy;
    }
	  
    @SuppressWarnings("unchecked")
    public void chooseAll(MyChooser mc) {
    	int count = 0;
    	E[] sorted = (E[]) new Object[this.size];
    	
    	for (int i = 0; i < this.size; i++) {
    		
    		if (this.elements[i] == null) {
    			continue;
    		}
    		
    		if (mc.chooseElement(this.elements[i]) == true) {
    			sorted[count++] = this.elements[i];
    		}
    	}
    	
    	E[] truncated = (E[]) new Object[count];
    	System.arraycopy(sorted, 0, truncated, 0, count);
    	
    	this.elements = truncated;
    	this.size = count;
    
    }
	 
    public boolean isEmpty() {
    	if (this.elements == null || this.elements.length == 0) {
    		return true;
    	}
    	return false;
    }

    
    
}