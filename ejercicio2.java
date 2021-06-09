import java.util.*;

public class ejercicio2{
	
	public static void main(String[] args){
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		num = scanner.nextInt();
		
		for (int i=num; i>0; i--){
			System.out.println(i+"");
		}
		
	}
}