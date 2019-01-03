/**
 * 
 * @author Infant Derrick Gnanasusairaj
 *
 */
public class Box extends Rectangle{
    /**
     * Constructor for a box
     * @param paintCharacter the paint character that will be the body of the box
     * @param width the width of the box
     * @param height the height of the box
     */
    public Box(char paintCharacter, int width, int height) {
        super(paintCharacter, width, height);
    }
    @Override
    /**
     * Paints the shape onto a screen at given position
     * @param s the Screen to be painted on
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void paintOn(Screen s, int x, int y) {
        for(int h = 0; h < getHeight(); h++)
            (new HLine(getPaintCharacter(), getWidth())).paintOn(s, x, y+h);
    }
}
