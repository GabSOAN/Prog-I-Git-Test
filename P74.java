import java.util.*;
public class P74{
	public static void main (String[] arg){
		Scanner entrada;
		Double a, b;
		entrada = new Scanner (System.in);
		System.out.println("x?");
		a = entrada.nextDouble();
		b = Math.sqrt (a + 4);
		System.out.println(b);
	}
}
