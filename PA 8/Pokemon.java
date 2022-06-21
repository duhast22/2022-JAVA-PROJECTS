///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment8.java
// File:               Pokemon.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Rachel Chung
//
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * This is a super class. PalPokemon.java and WildPokemon.java will be
 * inherited from this Pokemon class. To inherit from a class, 
 * use the extends keyword.
 *
 * Bugs: None known
 *
 * @author Rachel Chung
 */

public class Pokemon {

	protected String name;
	protected String sound;
	protected String type;

	/**
	 * Creates a new Pokemon with default values. Default name is
	 * "Pokemon", sound is "sound", and type is "unknown"
	 * 
	 */
	public Pokemon() {
		this.name = "Pokemon";
		this.sound = "sound";
		this.type = "unknown";
	}

	/**
	 * Creates a new Pokemon with the given pokemonName,
	 * soundIn, typeIn.
	 * 
	 * @param pokemonName the pokemon name
	 * @param soundIn sound that pokemon makes
	 * @param typeIn the type of the pokemon
	 */
	public Pokemon(String pokemonName, String soundIn, String typeIn) {
		this.name = pokemonName;
		this.sound = soundIn;
		this.type = typeIn;
	}

	/**
	 * Gets the name of the pokemon.
	 * 
	 * @return name of the pokemon
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the sound that this pokemon makes.
	 * 
	 * @return sound of the pokemon
	 */
	public String getSound() {
		return this.sound;
	}

	/**
	 * Gets the type of the pokemon.
	 * 
	 * @return type of the item
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Statement for this pokemon
	 * format: 
	 * 		"[pokemon name]: [pokemon sound]!\n"
	 * 
	 */
	public void speak() {
		System.out.println(this.name + ": " + this.sound + "!\n");
	}

	/**
	 * Returns a string representation of this object.
	 * 
	 * @return string representation of this object.
	 */
	@Override
	public String toString() {
		String outputString;

		outputString = this.name + " is a " + this.type + "\n"
			+ this.name + ": " + this.sound + "!\n";
		return outputString;
	}
}