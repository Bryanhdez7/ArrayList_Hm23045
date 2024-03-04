import java.util.ArrayList;

public class Ej009 {
    public static void main(String[] args) {
        // Crear el ArrayList original
        ArrayList<String> original = new ArrayList<>();
        original.add("Pikachu");
        original.add("Charizard");
        original.add("Bulbasaur");
        original.add("Squirtle");
        original.add("Jigglypuff");

        // Copiar el ArrayList original a otro ArrayList
        ArrayList<String> copia = new ArrayList<>(original);

        // Mostrar la copia del ArrayList
        System.out.println("Copia del ArrayList original:");
        System.out.println(copia);
    }
    // No se si a esto se referia la indicacion de este ejercicio xD
}
