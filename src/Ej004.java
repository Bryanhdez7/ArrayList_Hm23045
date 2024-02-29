import java.util.ArrayList;

public class Ej004 {
    public static void main(String[] args) {
        
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");
        nombresPokemon.add("Eevee");
        nombresPokemon.add("Mewtwo");
        nombresPokemon.add("Gyarados");
        nombresPokemon.add("Snorlax");
        nombresPokemon.add("Vulpix");

        // Índice especificado
        int indiceEspecificado = 2;

        // Recuperar el elemento del índice especificado
        String pokemon = nombresPokemon.get(indiceEspecificado);

        // Imprimir el elemento recuperado
        System.out.println("El Pokémon en el índice " + indiceEspecificado + " es: " + pokemon);
    

    }
}
