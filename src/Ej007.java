import java.util.ArrayList;

public class Ej007 {
    public static void main(String[] args) {
        // Crear el ArrayList de la PokeDex
        ArrayList<String> PokeDex = new ArrayList<>();
        PokeDex.add("Pikachu");
        PokeDex.add("Charizard");
        PokeDex.add("Bulbasaur");
        PokeDex.add("Squirtle");
        PokeDex.add("Jigglypuff");

        // Pokemon a buscar
        String pokemonABuscar = "Squirtle";

        // Buscar el pokemon en la PokeDex
        int posicion = -1;
        for (int i = 0; i < PokeDex.size(); i++) {
            if (PokeDex.get(i).equals(pokemonABuscar)) {
                posicion = i;
                break;
            }
        }

        // Verificar si el pokemon se encontro
        if (posicion != -1) {
            System.out.println("El Pokémon '" + pokemonABuscar + "' se encuentra en la posición " + posicion + " de la PokeDex.");
        } else {
            System.out.println("El Pokémon '" + pokemonABuscar + "' no se encuentra en la PokeDex.");
        }
    }

}
