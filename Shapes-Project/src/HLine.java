public class HLine extends Line {
    public HLine(char paintCharacter, int length) {
        super(paintCharacter, length);
    }
    @Override
    public void paintOn(Screen s, int x, int y) {
        for(int l = 0; l < this.getLength(); l++)
            s.paintAt(x+l, y, this.getPaintCharacter());
    }

    @Override
    public void paintOn(Screen s) {
        for(int l = 0; l < this.getLength(); l++)
            s.paintAt(l, 0, this.getPaintCharacter());
    }
}
