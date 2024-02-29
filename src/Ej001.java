import java.util.ArrayList;

public class Ej001 {
    public static void main(String[] args) {
        
        // Crear un ArrayList para almacenar nombres de Pokémon
        ArrayList<String> PokeDex = new ArrayList<>();

        // Agregar nombres de Pokémon a la PokeDex
        PokeDex.add("Pikachu");
        PokeDex.add("Charizard");
        PokeDex.add("Bulbasaur");
        PokeDex.add("Squirtle");
        PokeDex.add("Jigglypuff");

        // Imprimir la colección de nombres de Pokémon en la PokeDex
        System.out.println("Pokémon en la PokeDex:");
        for (String pokemon : PokeDex) {
            System.out.println(pokemon);
        }

    }
}
