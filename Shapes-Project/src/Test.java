public class Test {
    public static void main(String args[]){
        Screen s = new Screen(15,10,'.');
        Shape x = new Frame('*', 6,6);
        Shape y = new VLine('j', 3);
        x.paintOn(s);
        y.paintOn(s, 2,1);
        s.draw();
    }
}
