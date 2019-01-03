/**
 * @author Infant Derrick Gnanasusairaj
 */
public class Octagon extends Shape {
	private int side;
	public Octagon(char paintCharacter, int side) {
		super(paintCharacter);
		this.side = side;
	}

	/**
	 * Paints the shape onto a screen at given position
	 * @param s the Screen to be painted on
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	@Override
	public void paintOn(Screen s, int x, int y) {
		int i = 0;
		for(; i < side; i++) {
			(new HLine(getPaintCharacter(), side+2*i)).paintOn(s, x-i, y+i);
		}
		for(;i < 2*side-1; i++) {
			(new HLine(getPaintCharacter(), side+2*(side-1))).paintOn(s, x-(side-1), y+i);
		}
        for(i = side - 2;i >= 0; i--){
            (new HLine(getPaintCharacter(), side + 2*((side-2)-i))).paintOn(s, x-(side-2-i), (y+((2*(side -1) + side)-1))-(side-2-i));
        }
	}

}
