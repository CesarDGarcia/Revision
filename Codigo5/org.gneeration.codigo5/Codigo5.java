//Segun yo debe de marcar numeros ganadores cuando tu le introduzcas uno de los que tiene
import java.util.Scanner; // faltaba importarScanner

public class Codigo5 {


public static void main(String[] args) {

	Scanner s = new Scanner(System.in); // faltaba el System.in
	System.out.print("Introduzca un número: "); // tenia mal una comilla
	String ni = s.nextLine();
	int numero = Integer.parseInt(ni); // convertimos ni a numero entero
	int c = numero;
	

	int afo = 0;
	int noAfo = 0;
    //Tenemos que cambiar todos los ni > numero
	while(numero > 0)
	{
		int digito = (int) (numero % 10);
		if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
		} else {
			noAfo++;

			numero /= 10;
		}

		if (afo > noAfo) {
			System.out.println("El " + c + " es un número afortunado."); //faltaba t en println
		} else {
			System.out.println("El " + c + " no es un número afortunado.");
		}
    // faltaba cerrar scanner Cerrar el Scanner
	s.close();
	}
	
}
}