public class Test {
    public static void main(String args[]) {
        Screen s = new Screen(40, 40, '&');
        Shape x = new Frame('x', 6,6);
        Shape y = new VLine('j', 3);
        Shape oct = new Octagon('.', 10);
        oct.paintOn(s,15,0);
//        x.paintOn(s);
//        y.paintOn(s, 2,1);

//        x.paintOn(s);
//        Shape box = new Box('-', 4, 4);
//        Shape frame = new Frame('*', 4, 4);
//        box.paintOn(s, 0,0);
//        frame.paintOn(s, 5,5);
//        y.paintOn(s, 2,1);

        s.draw();
}
}
