
public class Octagon extends Shape {
	private int side;
	public Octagon(char paintCharacter, int side) {
		super(paintCharacter);
		this.side = side;
	}
	@Override
	public void paintOn(Screen s, int x, int y) {
		for(int i = 0; i < side; i ++) {
			(new HLine(getPaintCharacter(), side+2*i)).paintOn(s, x-i, y+i);
		}
		for(int i = side; i < side+side; i++) {
			(new HLine(getPaintCharacter(), side+2*side)).paintOn(s, x-side, y+i);
		}
	}

}
