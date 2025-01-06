import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the first number:"); 
		int a = scanner.nextInt(); 
		System.out.println("Enter the second number:"); 
		int b = scanner.nextInt();
		
		int big=a>b?a:b; 
        int lcm=big;
        while(true)
        {
            if(lcm%a==0 && lcm%b==0)
            break;
            else
            lcm=lcm+big;
        }
        System.out.println("LCM is "+lcm);
		
	}
}
