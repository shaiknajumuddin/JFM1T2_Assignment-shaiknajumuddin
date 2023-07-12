import java.util.Scanner;

public class CheckingEquality {

//main method
public static void main(String[]args)
  {
/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
  Scanner sc=new Scanner(System.in);

/*Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
   System.out.println("Enter any Two Number");
int a=sc.nextInt();
int b=sc.nextInt();
//check if the two numbers are equal or not
if(a==b)
   System.out.println(+a+" and "+b+" are Equal");
//If the two numbers are equal then print both are equal else print both are not equal
else
  System.out.println(+a+" and "+b+" are Not Equal");
}
}