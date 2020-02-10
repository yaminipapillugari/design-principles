package desigPrinciples;
import java.util.Scanner;
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers to perform arithematic operations:");
		String m=s.nextLine();
		String p=s.nextLine();
		System.out.println("Enter your choice:\n1:ADDITION\n2:SUBTRACTION\n3:MULTIPLICATION\n4:DIVISION");
		int z=s.nextInt();
       arithematic a=new arithematic();
       
       a.validation(m, p,z);
	}

}
