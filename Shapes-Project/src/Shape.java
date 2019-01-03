/**
 * 
 * @author Inafnt Derrick Gnanasusairaj
 *
 */
public abstract class Shape {
	/**
	 * private data field
	 */
    private char paintCharacter;
    public Shape(char paintCharacter){
        this.paintCharacter = paintCharacter;
    }
    /**
     * Getter for the paintCharacter
     * @return the paintCharacter
     */
    public char getPaintCharacter() {
        return paintCharacter;
    }
    /**
     * Setter for the paintCharacter
     * @param paintCharacter
     */
    public void setPaintCharacter(char paintCharacter) {
        this.paintCharacter = paintCharacter;
    }
    /**
     * Paints the shape onto a screen at given position
     * @param s the Screen to be painted on
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public abstract void paintOn(Screen s, int x, int y);
    /**
     * Paints the shape onto the screen at the origin
     * @param s the screen
     */
    public void paintOn(Screen s) {
    	paintOn(s,0,0);
    }
}
