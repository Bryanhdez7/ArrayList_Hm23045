import java.util.ArrayList;

public class Ej003 {
    public static void main(String[] args)  {
        
       // ArrayList de nombres de Pokémon
       ArrayList<String> nombresPokemon = new ArrayList<>();
       nombresPokemon.add("Charizard");
       nombresPokemon.add("Bulbasaur");
       nombresPokemon.add("Squirtle");
       nombresPokemon.add("Jigglypuff");

       // Nuevo Pokémon a insertar
       String nuevoPokemon = "Pikachu";

       // Insertar el nuevo Pokémon en la primera posición
       nombresPokemon.add(0, nuevoPokemon);

       // Imprimir la lista actualizada de nombres de Pokémon
       System.out.println("Nombres de Pokémon actualizados:");
       for (String nombre : nombresPokemon) {
           System.out.println(nombre);
       }

    }
}
