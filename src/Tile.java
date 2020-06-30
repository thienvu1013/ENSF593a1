
/**
 * @author Thien Nguyen
 * Class: Tile
 * 
 * This class represent tile objects in the game Scrabble.
 * This class store a character and a value. It can also compare
 * 2 different tile to see if their values matches.
 */
public class Tile {
	private char letter;
	private int value;
	
	//Default constructor
	public Tile() {
		this.letter = 'A';
		this.value = 1;
	}
	//Alternative constructor
	public Tile(char l, int v) {
		this.letter = l;
		this.value = v;
	}
	//@override toString() from Object
	public String toString() {
		String result = this.letter +"["+this.value+"]";
		return result;
	}
	//@override equals() from Object
	public boolean equals(Object t1) {
		Tile t2 = (Tile) t1;
		return (this.letter == t2.letter) && (this.value == t2.value);
	}
	
	//Stub main() for testing
	public static void main(String[] args) {
		Tile a0 = new Tile('A',1);
		Tile a1 = new Tile('A',1);
		Tile a2 = new Tile('Z',10);
		
		System.out.println("Tile 0: "+ a0.toString());
		System.out.println("Tile 1: "+ a1.toString());
		System.out.println("Tile 2: "+ a2.toString());
		System.out.println("Tile 0 is equal to Tile 1 is "+ a0.equals(a1));
		System.out.println("Tile 0 is equal to Tile 2 is "+ a0.equals(a2));
		
		
	}

}
