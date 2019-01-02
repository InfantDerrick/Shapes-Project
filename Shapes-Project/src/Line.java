
public abstract class Line extends Shape {
	private int length;
	public Line(char paintCharacter, int length){
		super(paintCharacter);
		this.length = length;
	}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
	public abstract void paintOn(Screen s, int x, int y);

	@Override
	public abstract void paintOn(Screen s);

}
