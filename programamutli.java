import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
///////        /// Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
//////////
        ///// Pide al usuario que introduzca el primer número
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
//SIUUUU
        // Pide al usuario que introduzca el segundo número
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
////////
        // Calcula la suma de los dos números
        double suma = num1 + num2;

        // Muestra el resultado
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

        // Cierra el objeto Scanner
        scanner.close();
    }
}
