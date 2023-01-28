import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ICalculator calculator = new Calculator();

        FileHandler fh = new FileHandler();
        File operations = fh.createFile("Operations.txt");

        String DIVIDER = "-----------------------------------------------------------";
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println(DIVIDER);
            System.out.println(
                "1. Leer archivo y mostrar resultados\n" + 
                "2. Mostrar el ultimo resultado\n" + 
                "3. Salir del programa"
            );
            System.out.println(DIVIDER);
            System.out.print("Ingrese una opcion: ");
            String input = sc.next();
            System.out.println(DIVIDER);
            switch (input) {
                case "1":   // Leer archivo y evaluar operaciones
                    // Leer el archivo y guardar las lineas en un array
                    String[] expressions = fh.readDataFromFile(operations);
                    // Iterar sobre las lineas leidas
                    for (String expression : expressions) {
                        // TODO: Evaluar las lineas para ver si son operaciones validas
                        System.out.println(expression);
                    }
                    break;
                case "2":   // Mostrar el ultimo resultado calculado
                    // TODO: Comprobar si existe un resultado previo valido y si existe, imprimirlo
                    double lastResult = calculator.getPrevious();
                    System.out.println(lastResult);
                    break;
                case "3":   // Salir del programa
                    exit = true;
                    System.out.println("Gracias por utilizar el programa");
                    System.out.println(DIVIDER);
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida");
                    break;
            }
        }
        sc.close();        
    }
}
