///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment8.java
// File:               Item.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Rachel Chung
//
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * This is a super class. Berry.java and Pokeball.java will be
 * inherited from this Item class. To inherit from a class, 
 * use the extends keyword.
 *
 * Bugs: None known
 *
 */

public class Item{
	protected String name;

	/**
	 * Creates a new Item with default name "item"
	 * 
	 */
	public Item () {
		this.name = "item";
	}

	/**
	 * Creates a new Item with the given itemName
	 *
	 * @param itemName the item name
	 */
	public Item(String itemName) {
		this.name = itemName;
	}

	/**
	 * Gets the name of the item.
	 * 
	 * @return name of the item
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns a string representation of this object.
	 * 
	 * @return string representation of this object.
	 */
	@Override
	public String toString() {
		String outputString;

		outputString = this.name + "\n";
		return outputString;
	}
}