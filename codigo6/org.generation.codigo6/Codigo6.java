import java.util.Scanner;

public class Codigo6 {
	public static void main(String[] args){ //pusimos una clase main
	    int[] n = new int [20]; // le faltaba un new

	    for (int i = 0; i < 20; i++) { //agregamos un + al i
	      n[i] = (int)(Math.random() * 381) + 20;
	    System.out.print(n[i] + " ");
	    }
	    
		System.out.println();// ponemos aqui la impresion del arreglo
	    System.out.print("¿Qué números quiere resaltar? (1 para múltiplos de 5, 2 para múltiplos de 7): "); // podemos ponerlo en un solo print y cambiar -
	    Scanner scanner= new Scanner(System.in);
        int opcion= scanner.nextInt(); // faltaba un parentesis ) Esto podemos cambiarlo por un Scanner

	    int multiplo = (opcion == 1) ? 5 : 7; //cambiamos de lugar ? y :
		System.out.println(); // colocamos un System.out.println()
	    for (int e : n) { //cambiamos el foreach por un for y char por int
	    if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
		}else {
	        System.out.print(e + " "); // Cambiamos System.in.println() por System.out.println()
	    }
		scanner.close();

	    }
	}
}
