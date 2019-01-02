public abstract class Shape {
    private char paintCharacter;
    public Shape(char paintCharacter){
        this.paintCharacter = paintCharacter;
    }

    public char getPaintCharacter() {
        return paintCharacter;
    }

    public void setPaintCharacter(char paintCharacter) {
        this.paintCharacter = paintCharacter;
    }
    public abstract void paintOn(Screen s, int x, int y);
    public abstract void paintOn(Screen s);
}
