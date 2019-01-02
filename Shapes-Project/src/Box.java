public class Box extends Rectangle{
    public Box(char paintCharacter, int width, int height) {
        super(paintCharacter, width, height);
    }

    @Override
    public void paintOn(Screen s, int x, int y) {
        super.paintOn(s, x, y);
        for(int w = 0; w < getWidth()-1;  w++)
            for(int h = 0; h <getHeight()-1; h++)
                s.paintAt(x+1+w, y+1+h, getPaintCharacter());

    }

    @Override
    public void paintOn(Screen s) {
        super.paintOn(s);
        for(int w = 0; w < getWidth()-1;  w++)
            for(int h = 0; h <getHeight()-1; h++)
                s.paintAt(1+w, 1+h, getPaintCharacter());
    }
}
