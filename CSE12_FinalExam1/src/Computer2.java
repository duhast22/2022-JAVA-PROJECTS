public class Computer2  implements Computer{
	private String modelName;
	
	public Computer2(String modelName) {
		this.modelName = modelName;
	}
	// Returns the model name of the computer as a string
    public String getModel() {
    	return this.modelName;
    }
}
