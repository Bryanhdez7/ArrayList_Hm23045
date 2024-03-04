import java.util.ArrayList;

public class Ej006 {
        public static void main(String[] args) {
        // Crear el ArrayList de nombres de Pokémon
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Eliminar el tercer elemento (índice 2)
        nombresPokemon.remove(2);

        // Mostrar la lista de nombres de Pokémon después de eliminar el tercer elemento
        System.out.println("Nombres de Pokémon después de eliminar el tercer elemento:");
        System.out.println(nombresPokemon);
    }


}
