import java.util.Scanner;
/**
 * 
 * @author Infant Derrick Gnanasusairaj
 *
 */
public class Menu {
    /**
     * Private data fields
     */
	private static Scanner sc = new Scanner(System.in);
	private static Screen s;

    /**
     * Starts the menu operations
     */
	public static void start() {
	    char input;
		do {
		    if(s == null)
                setScreen();
		System.out.println("Enter 'A' to add shapes to canvas");
		System.out.println("Enter 'C' to clear canvas");
		System.out.println("Enter 'D' to display canvas");
		System.out.println("Enter 'S' to change canvas border");
		System.out.println("Enter 'E' to add exit");
		input = sc.next().toCharArray()[0];
		if(input == 'A') {
			add();
		}else if(input=='C') {
            s.clear();
		}else if(input=='D') {
            s.draw();
        }else if(input=='S'){
            System.out.println("What would you like the border to be?");
            char bChar = sc.next().toCharArray()[0];
            s.setBorder(bChar);
		}else if(!(input=='E')) {
			error();
		}
		}while(input!='E');
	}

    /**
     * Set the attributes of the screen
     */
	public static void setScreen(){
	    System.out.println("What do you want the width of the screen to be?");
	    int w = 30, h = 30;

	    if(sc.hasNextInt())
	        w = sc.nextInt();
	    else
	        error();
        System.out.println("What do you want the height of the screen to be?");
        if(sc.hasNextInt())
            h = sc.nextInt();
        else
            error();
        s = new Screen(w,h,'.');
    }

    /**
     * Add new shapes to the canvas
     */
	public static void add() {
		int x, y, l, w;
		char paintChar;
		System.out.println("What shape do you want to add?" + "\n");
		System.out.println("1: Vertical line");
		System.out.println("2: Horizontal line");
		System.out.println("3: Box");
		System.out.println("4: Frame");
		System.out.println("5: Octagon");
		switch(sc.next()) {
			case "1":
				System.out.println("What is the length of the line?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the line");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the line");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the line is made of");
                paintChar = sc.next().toCharArray()[0];
				(new VLine(paintChar, l)).paintOn(s,x,y);
				break;
			case "2":
				System.out.println("What is the length of the line?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the line");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the line");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the line is made of");
                paintChar = sc.next().toCharArray()[0];
				(new HLine(paintChar, l)).paintOn(s,x,y);
				break;
			case "3":
				System.out.println("What is the length of the Box?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("What is the width of the Box?");
				w = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the Box");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the Box");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the Box is made of");
                paintChar = sc.next().toCharArray()[0];
				(new Box(paintChar, w, l)).paintOn(s,x,y);
			case "4":
				System.out.println("What is the length of the Frame?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("What is the width of the Frame?");
				w = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the Frame");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the Frame");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the Frame is made of");
                paintChar = sc.next().toCharArray()[0];
				(new Frame(paintChar, w, l)).paintOn(s,x,y);
				break;
			case "5":
				System.out.println("What is the side length of the octagon?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the octagon");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the octagon");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the octagon is made of");
                paintChar = sc.next().toCharArray()[0];
				(new Octagon(paintChar, l)).paintOn(s,x,y);
				break;
				default:
					error();
		}
	}

    /**
     * Error code for the class
     */
	public static void error() {
		System.out.println("Give me meaningful data");
	}
}
