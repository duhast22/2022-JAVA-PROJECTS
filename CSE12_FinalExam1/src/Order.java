//DO NOT SUBMIT TO AUTOGRADER
interface Computer {
    // Returns the model name of the computer as a string
    String getModel();
}

public class Order {
	private String orderID;
	private int statusCode;
	private Computer2 actualProduct;
	
	public Order(String orderID, int statusCode, Computer2 actualProduct) {
		this.orderID = orderID;
		this.statusCode = statusCode;
		this.actualProduct = actualProduct;
	}
	
    // Returns the Id of this order
    public String getId() {
    	return this.orderID;
    }

    // Returns the status code of this order
    public int getStatus() {
    	return this.statusCode;
    }

    // Sets the status code of this order
    public void setStatus(int status) {
    	this.statusCode = status;
    }

    // Returns the Computer of this order
    public Computer2 getProduct() {
    	return this.actualProduct;
    }
    
}
