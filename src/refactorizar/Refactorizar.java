package refactorizar;

 // Lista los numeros primos de dos cifras
import java.util.Scanner;

public class Refactorizar {

    public static void main(String[] args) {
        boolean esPrimo = false;
        int lonDigitos;
        int conDigitos = 0;
        lonDigitos = entradaDato();
        if (lonDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 999999999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            conDigitos = contador;

            if (conDigitos == lonDigitos) {
                if (i < 4) {
                    esPrimo = true;
                } else {
                    if (i % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

    public static int entradaDato() {
        int lonDigitos;
        System.out.print("intoduzca el numero de digitos:");
        Scanner dato = new Scanner(System.in);
        lonDigitos = dato.nextInt();
        return lonDigitos;
    }

}
