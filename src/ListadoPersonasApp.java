import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        // Empezamos con el menu
        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            System.out.println();
        }
    } // Aquí cierra el método main

    private static void mostrarMenu() {
        // Mostramos las opciones
        System.out.println("""
                ***People Listing App***
                1. Add
                2. List
                3. Exit
                """);
        System.out.print("Provide the option? ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // Revisamos la opcion proporcionada
        switch (opcion) {
            case 1 -> { // Agregar persona a la lista
                System.out.println("Provide the name: ");
                var nombre = consola.nextLine();
                System.out.println("Provide the phone number");
                var tel = consola.nextLine();
                System.out.println("Provide the email");
                var email = consola.nextLine();
                // Crear el objeto Persona
                var persona = new Persona(nombre, tel, email);
                // Agregar el objeto a la lista de personas
                personas.add(persona);
                System.out.println("The list has: " + personas.size() + " elements");
            } // Fin caso 1
            case 2 -> { // Lista las personas
                System.out.println("List of People: ");
                personas.forEach(System.out::println);
            }
            case 3 -> { // Salimos del ciclo
                System.out.println("See you soon...");
                salir = true;
            }
            default -> System.out.println("Wrong option: " + opcion);
        } // Fin switch
        return salir;
    }
} // Aquí cierra la clase
