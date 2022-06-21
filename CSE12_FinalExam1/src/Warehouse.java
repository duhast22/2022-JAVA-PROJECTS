import java.util.*;
public class Warehouse implements Inventory {
	
	private Computer[] availableComputermodels;
	private int[] amountOfStockForEachModel;
	public ArrayList<Order> pendingOrders;
	
	/*Constructor that takes Computer[] and int[] as arguments.
	* The Computer[] will contain all the available models that the warehouse carries.
	* The int[] will contain the amount of stock for each model.
	* Corresponding indices relate to each other.
	*/
	public Warehouse(Computer[] availableComputermodels, int[] amountOfStockForEachModel) {
		this.availableComputermodels = availableComputermodels;
		this.amountOfStockForEachModel = amountOfStockForEachModel;
	}
	
	public boolean makeNewOrder(Order o) {
		//check to see if order is null
		if (o == null) { return false; }
		
		//check to see if order already exists in the list
		if (pendingOrders.contains(o)) { return false; }
		
		
		//check to see if order id is a duplicate
		if (pendingOrders.size() > 0) {
			for (int i = 0; i < pendingOrders.size(); i++) {
				if (pendingOrders.get(i).getId().equals(o.getId())) { return false; }
			}
		}
		
		//order cannot be completed because the warehouse does not carry the requested model
		if (!Arrays.asList(availableComputermodels).contains(o.getProduct().getModel())) {
			o.setStatus(0);
			pendingOrders.add(o);
			return false;
		}
		
		//order cannot be completed because there is no more stock of the requested model
		for (int k = 0; k < availableComputermodels.length; k++) {
			if (availableComputermodels[k].equals(o.getProduct().getModel())) {
				if (amountOfStockForEachModel[k] < 1) {
					o.setStatus(0);
					pendingOrders.add(o);
					return false; 
				}
			}
		}
		o.setStatus(1);
		pendingOrders.add(o);
		return true;
	}
	
	public int trackOrder(String id) {
		if (id == null) { return -1; }
		if (pendingOrders.isEmpty()) { return -1; }
		
		for (int i = 0; i < pendingOrders.size(); i++) {
			if (pendingOrders.get(i).getId().equals(id)) {
				return pendingOrders.get(i).getStatus();
			}
		}
		return -1;
	}
	
	public boolean fulfillNextOrder() {
		int val = 0;
		
		Order currentOrder = pendingOrders.get(val);
		
		while (!pendingOrders.isEmpty() && pendingOrders.size() > val) {
			if (currentOrder.getStatus() == 1) {
				if (!Arrays.asList(availableComputermodels).contains(currentOrder.getProduct().getModel())) {
					currentOrder.setStatus(2);
					return false;
				}
				
				for (int k = 0; k < availableComputermodels.length; k++) {
					if (availableComputermodels[k].equals(currentOrder.getProduct().getModel())) {
						if (amountOfStockForEachModel[k] < 1) {
							currentOrder.setStatus(2);
							return false; 
						}
						else {
							currentOrder.setStatus(3);
							amountOfStockForEachModel[k] = amountOfStockForEachModel[k]-1;
							return true;
						}
					}
				}
			}
			val++;
		}
		return false;
	}
	
}
