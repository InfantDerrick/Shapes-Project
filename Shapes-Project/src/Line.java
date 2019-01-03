/**
 * 
 * @author Infant Derrick Gnanasusairaj
 *
 */
public abstract class Line extends Shape {
	/**
	 * Private data fields
	 */
	private int length;
	/**
	 * Constructor for a Line with character and length
	 * @param paintCharacter the paint character that will be the body of the line
	 * @param length the length of the line
	 */
	public Line(char paintCharacter, int length){
		super(paintCharacter);
		this.length = length;
	}
	/**
	 * getter for length
	 * @return the length
	 */
    public int getLength() {
        return length;
    }
    /**
     * setter for length
     * @param length the new length
     */
    public void setLength(int length) {
        this.length = length;
    }

}
