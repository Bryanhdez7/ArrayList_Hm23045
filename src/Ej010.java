import java.util.ArrayList;
import java.util.Collections;

public class Ej010 {
    public static void main(String[] args) {
        // Crear el ArrayList de nombres de Pokémon
        ArrayList<String> PokeDex = new ArrayList<>();
        PokeDex.add("Pikachu");
        PokeDex.add("Charizard");
        PokeDex.add("Bulbasaur");
        PokeDex.add("Squirtle");
        PokeDex.add("Jigglypuff");

        // Mezclar aleatoriamente los nombres de Pokémon en el ArrayList
        Collections.shuffle(PokeDex);

        // Mostrar la PokeDex de forma aleatoria
        System.out.println("PokeDex aleatoria:");
        System.out.println(PokeDex);
    }
}
