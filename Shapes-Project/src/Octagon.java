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
		int r = 0;
		for(; r < side; r++) {
			(new HLine(getPaintCharacter(), side+2*r)).paintOn(s, r-r, y+r);
		}
		for(;r < 2*side-1; r++) {
			(new HLine(getPaintCharacter(), side+2*(side-1))).paintOn(s, r-(side-1), y+r);
		}
        for(r = side - 2;r >= 0; r--){
            (new HLine(getPaintCharacter(), side + 2*((side-2)-r))).paintOn(s, r-(side-2-r), (y+((2*(side -1) + side)-1))-(side-2-r));
        }
	}

}
