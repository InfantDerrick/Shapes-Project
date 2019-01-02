public abstract class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(char paintCharacter, int width, int height){
        super(paintCharacter);
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {

        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void paintOn(Screen s, int x, int y) {
        for(int w = 0; w < width; w++){
            s.paintAt(x + w,y,getPaintCharacter());
            s.paintAt(x + w,y + height-1,getPaintCharacter());
        }
        for (int l = 0; l < height; l++){
            s.paintAt(x, y+l, getPaintCharacter());
            s.paintAt(x + width-1, y+l, getPaintCharacter());
        }
    }

    @Override
    public void paintOn(Screen s) {
        for(int w = 0; w < width; w++){
            s.paintAt(w,0,getPaintCharacter());
            s.paintAt(w,height-1,getPaintCharacter());
        }
        for (int l = 0; l < height; l++){
            s.paintAt(0, l, getPaintCharacter());
            s.paintAt(width-1, l, getPaintCharacter());
        }
    }
}
