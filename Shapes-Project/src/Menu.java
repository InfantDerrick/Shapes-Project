import java.util.Scanner;
/**
 * 
 * @author Infant Derrick Gnanasusairaj
 *
 */
public class Menu {
	private static Scanner sc = new Scanner(System.in);
	private static Screen s = new Screen(30,30,'*');
	public static void start() {
		do {
		System.out.println("Enter 'A' to add shapes");
		System.out.println("Enter 'D' to display screen");
		System.out.println("Enter 'E' to add exit");
		if(sc.nextLine().equals("A")) {
			add();
		}else if(sc.nextLine().equals("D")) {
			display();
		}else if(!sc.nextLine().equals("E")) {
			error();
		}
		}while(!sc.nextLine().equals("E"));
	}
	public static void add() {
		int x = 0, y = 0, l = 0, w = 0;
		char paintChar = '.';
		System.out.println("What shape do you want to add?" + "\n");
		System.out.println("1: Vertical line");
		System.out.println("2: Horizontal line");
		System.out.println("3: Box");
		System.out.println("4: Frame");
		System.out.println("5: Octagon");
		switch(sc.nextLine()) {
			case "1":
				System.out.println("What is the length of the line?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the line");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the line");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the line is made of");
				paintChar = sc.nextLine().length()>1?'.':sc.nextLine().charAt(0);
				(new VLine(paintChar, l)).paintOn(s,x,y);
			case "2":
				System.out.println("What is the length of the line?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the line");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the line");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the line is made of");
				paintChar = sc.nextLine().length()>1?'.':sc.nextLine().charAt(0);
				(new HLine(paintChar, l)).paintOn(s,x,y);
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
				paintChar = sc.nextLine().length()>1?'.':sc.nextLine().charAt(0);
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
				paintChar = sc.nextLine().length()>1?'.':sc.nextLine().charAt(0);
				(new Frame(paintChar, w, l)).paintOn(s,x,y);
			case "5":
				System.out.println("What is the side length of the octagon?");
				l = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The x coordinate of the octagon");
				x = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The y coordinate of the octagon");
				y = sc.hasNextInt()?sc.nextInt():0;
				System.out.println("The character of the octagon is made of");
				paintChar = sc.nextLine().length()>1?'.':sc.nextLine().charAt(0);
				(new Octagon(paintChar, l)).paintOn(s,x,y);
		}
	}
	public static void display() {
		s.draw();
	}
	public static void error() {
		System.out.println("Give me meaningful data");
	}
}
