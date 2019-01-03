/**
 * 
 * @author Infant Derrrick Gnanasusairaj
 *
 */
public class Frame extends Rectangle {
    /**
     * Constructor for a frame
     * @param paintCharacter the paint character that will be the body of the frame
     * @param width the width of the frame
     * @param height the height of the frame
     */
    public Frame(char paintCharacter, int width, int height) {
        super(paintCharacter, width, height);
    }

    /**
     * Paints the shape onto a screen at given position
     * @param s the Screen to be painted on
     * @param x the x coordinate
     * @param y the y coordinate
     */
    @Override
    public void paintOn(Screen s, int x, int y) {
        (new HLine(getPaintCharacter(), getWidth())).paintOn(s, x, y);
        (new HLine(getPaintCharacter(), getWidth())).paintOn(s, x, y+getHeight()-1);
        (new VLine(getPaintCharacter(), getHeight())).paintOn(s, x, y);
        (new VLine(getPaintCharacter(), getHeight())).paintOn(s, x+getWidth()-1, y);
    }

}
