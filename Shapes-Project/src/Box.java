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
        super.paintOn(s, x, y);
        for(int w = 0; w < getWidth()-1;  w++)
            for(int h = 0; h <getHeight()-1; h++)
                s.paintAt(x+1+w, y+1+h, getPaintCharacter());

    }
}
