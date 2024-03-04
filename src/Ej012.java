import java.util.ArrayList;
import java.util.List;

public class Ej012 {
    public static void main(String[] args) {
        // Crear el ArrayList de nombres de Pokémon
        ArrayList<String> PokeDex = new ArrayList<>();
        PokeDex.add("Pikachu");
        PokeDex.add("Charizard");
        PokeDex.add("Bulbasaur");
        PokeDex.add("Squirtle");
        PokeDex.add("Jigglypuff");

        // Índice de inicio y fin para extraer la porción
        int indiceInicio = 1;
        int indiceFin = 4;

        // Extraer la porción del ArrayList
        List<String> porcion = PokeDex.subList(indiceInicio, indiceFin );

        // Mostrar la porción extraída
        System.out.println("Porción extraída del ArrayList:");
        System.out.println(porcion);
    }
}
