import java.util.Scanner;

public class NumerosPerfectos {
    
    public static boolean esNumeroPerfecto(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }

    
    public static void encontrarNumerosPerfectos(int inicio, int fin) {
        System.out.println("Números perfectos en el rango [" + inicio + ", " + fin + "]:");
        for (int i = inicio; i <= fin; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

      
        System.out.print("Ingrese el valor inicial del rango: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingrese el valor final del rango: ");
        int fin = scanner.nextInt();

        encontrarNumerosPerfectos(inicio, fin);

        scanner.close();
    }
}

