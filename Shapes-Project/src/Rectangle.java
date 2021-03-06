/**
 * 
 * @author Infant Derrick Gnanasusairaj
 *
 */
public abstract class Rectangle extends Shape{
	/**
	 * private data fields
	 */
    private int width;
    private int height;
    /**
     * Constructor for a rectangle
     * @param paintCharacter the paint character that will be the body of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(char paintCharacter, int width, int height){
        super(paintCharacter);
        this.width = width;
        this.height = height;
    }
    /**
     * setter of the width
     * @param width the new width
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * setter for the height
     * @param height the new height
     */
    public void setHeight(int height) {
        this.height = height;
    }
    /**
     * getter for the width
     * @return the width of the rectangle
     */
    public int getWidth() {

        return width;
    }
    /**
     * getter for the height
     * @return the height of the rectangle
     */
    public int getHeight() {
        return height;
    }
}
