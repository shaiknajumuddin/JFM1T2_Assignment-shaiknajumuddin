//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class BooleanOperation {

//main method
  public static void main(String[]args)
  {

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
    Scanner sc=new Scanner(System.in);

/*Take input from user
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
*/
    System.out.println("Enter X value");
    boolean x=sc.nextBoolean();
     System.out.println("Enter Y value");
    boolean y=sc.nextBoolean();
    System.out.println("x&y is : "+(x&&y));
    System.out.println("x||Y is : "+(x||y));
    System.out.println("!x is : "+(!x));
    System.out.println("!y is : "+(!y));

//print apppropriate result for boolean operations
  }
}