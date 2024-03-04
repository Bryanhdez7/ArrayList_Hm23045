import java.util.ArrayList;

public class Ej014 {
    public static void main(String[] args) {
        // Crear el ArrayList de nombres de Pokémon
        ArrayList<String> PokeDex = new ArrayList<>();
        PokeDex.add("Pikachu");
        PokeDex.add("Charizard");
        PokeDex.add("Bulbasaur");
        PokeDex.add("Squirtle");
        PokeDex.add("Jigglypuff");

        // Índices de los elementos a intercambiar
        int indice1 = 0;
        int indice2 = 4;

        // Intercambiar los elementos en el ArrayList
        String temp = PokeDex.get(indice1);
        PokeDex.set(indice1, PokeDex.get(indice2));
        PokeDex.set(indice2, temp);

        // Mostrar el ArrayList después del intercambio
        System.out.println("PokeDex después del intercambio:");
        System.out.println(PokeDex);
    }
}
