import java.util.ArrayList;

public class Ej013 {
    public static void main(String[] args) {
        // Pokedex de Ash
        ArrayList<String> pokedexAsh = new ArrayList<>();
        pokedexAsh.add("Pikachu");
        pokedexAsh.add("Charizard");
        pokedexAsh.add("Bulbasaur");

        // Pokedex de Brock
        ArrayList<String> pokedexBrock = new ArrayList<>();
        pokedexBrock.add("Bulbasaur");
        pokedexBrock.add("Squirtle");
        pokedexBrock.add("Jigglypuff");

        // Comparar si las Pokedex son iguales
        if (pokedexAsh.equals(pokedexBrock)) {
            System.out.println("Las Pokedex son iguales.");
        } else {
            System.out.println("Las Pokedex no son iguales.");
        }
    }
}
