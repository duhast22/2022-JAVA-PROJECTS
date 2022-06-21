
public interface Inventory {
	boolean makeNewOrder(Order o);
	int trackOrder(String id);
	boolean fulfillNextOrder();
}
