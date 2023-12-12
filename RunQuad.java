package quadrakill;
import java.util.Scanner;
public class RunQuad extends Square{
    public static void main(String[] args) {
    Scanner PScan = new Scanner(System.in);
    Square Ss = new Square();
    Rectangle Rr= new Rectangle();
        System.out.println("Press R for Rectangle. Press S for Square.");
        String Choice = PScan.nextLine().toUpperCase();
        switch (Choice) {
            case "R":
                System.out.println("A Rectangle: ");
                Rr.showDescription();
                break;
            case "S":
                System.out.println("A Square: ");
                Ss.showDescription();
                break;
            default:
                System.out.println("Please choose R or S.");
            
}
}
}
