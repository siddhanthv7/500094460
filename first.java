import java.util.Scanner;  
public class Test {  
	public static void main(String args[]){ 
		Scanner input = null; 
		try { 
			System.out.println("Please Enter 5 numbers"); 
			input = new Scanner(System.in); 
			int prod = 1; 
			for (int i = 0; i < 5; i += 1){ 
				prod *= input.nextInt(); 
			} 
			System.out.println("The product of numbers is: " + prod ); 
		} catch (Exception e) {  
			e.printStackTrace(); 
		} finally { 
			input.close(); 
		} 
	} 
}
