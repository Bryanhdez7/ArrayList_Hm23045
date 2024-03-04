import java.util.ArrayList;
import java.util.Collections;

public class Ej011 {
    public static void main(String[] args) {
        // Crear el ArrayList de nombres de Pokémon
        ArrayList<String> PokeDex = new ArrayList<>();
        PokeDex.add("Pikachu");
        PokeDex.add("Charizard");
        PokeDex.add("Bulbasaur");
        PokeDex.add("Squirtle");
        PokeDex.add("Jigglypuff");

        // Invertir los elementos en el ArrayList
        Collections.reverse(PokeDex);

        // Mostrar la PokeDex después de invertir
        System.out.println("PokeDex invertida:");
        System.out.println(PokeDex);
    }
}
