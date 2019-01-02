public class VLine extends Line{
    public VLine(char paintCharacter, int length){
        super(paintCharacter, length);
    }
    @Override
    public void paintOn(Screen s, int x, int y) {
        for(int l = 0; l < this.getLength(); l++)
            s.paintAt(x, y + l, this.getPaintCharacter());
    }

    @Override
    public void paintOn(Screen s) {
        for (int l = 0; l < getLength(); l++)
            s.paintAt(0,l,this.getPaintCharacter());
    }
}
