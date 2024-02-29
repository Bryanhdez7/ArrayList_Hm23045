import java.util.ArrayList;

public class Ej005 {
    public static void main(String[] args) {
        
        // ArrayList de nombres de Pokémon
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Pokémon a actualizar y nuevo Pokémon
        String pokemonAActualizar = "Charizard";
        String nuevoPokemon = "Dragonite";

        // Encontrar el índice del Pokémon a actualizar
        int indice = nombresPokemon.indexOf(pokemonAActualizar);

        // Verificar si el Pokémon a actualizar está en la lista
        if (indice != -1) {
            // Actualizar el Pokémon en el índice especificado con el nuevo Pokémon
            nombresPokemon.set(indice, nuevoPokemon);

            // Imprimir la lista actualizada de nombres de Pokémon
            System.out.println("Nombres de Pokémon actualizados:");
            for (String nombre : nombresPokemon) {
                System.out.println(nombre);
            }
        } else {
            System.out.println("El Pokémon a actualizar no se encontró en la lista.");
        }

    }
}
