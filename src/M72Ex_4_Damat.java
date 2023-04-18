import java.util.Scanner;

public class M72Ex_4_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int num1 = 0;
	    
	    
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introdueix un nombre per retornar-te el factorial: ");
			num1 = entrada.nextInt();
		
		
			 
			System.out.println("El nombre factorial es: " + factorial(num1));
		
		}

		
		public static int factorial(int num1) {
			
			int multi = 0;
			int num2 = num1;
			int num3 = 0;
			
			for (int i = 1 ; i < num1; i++) {
				multi = (num2 * (num1 - i));
				num3 = multi;
				num2 = num3;
				
			}
			
			//System.out.println(multi);
			
			return multi;

		}
}
