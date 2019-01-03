/**
 * 
 * @author Infant Derrick Gnanasusairaj
 *
 */
public class VLine extends Line{
	/**
	 * Constructor for a vertical line
	 * @param paintCharacter the paint character that will be the body of the line
	 * @param length the length of the line
	 */
    public VLine(char paintCharacter, int length){
        super(paintCharacter, length);
    }
    @Override
    /**
     * Paints the shape onto a screen at given position
     * @param s the Screen to be painted on
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void paintOn(Screen s, int x, int y) {
        for(int l = 0; l < this.getLength(); l++)
            s.paintAt(x, y + l, this.getPaintCharacter());
    }
}
