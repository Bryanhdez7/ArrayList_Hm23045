import java.util.ArrayList;

public class Ej008 {
    public static void main(String[] args) {
        // Crear el ArrayList de nombres de Pokémon
        ArrayList<String> PokeDex = new ArrayList<>();
        PokeDex.add("Pikachu");
        PokeDex.add("Charizard");
        PokeDex.add("Bulbasaur");
        PokeDex.add("Squirtle");
        PokeDex.add("Jigglypuff");

        ordenarArrayList(PokeDex);

        // Mostrar la lista de la PokeDex después de ordenar
        System.out.println("PokeDex ordenada alfabéticamente:");
        System.out.println(PokeDex);
    }

    // Método para ordenar alfabéticamente el ArrayList
    public static void ordenarArrayList(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).compareTo(arrayList.get(j)) > 0) {
                    // Intercambiar los elementos si están en orden incorrecto
                    String temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
    }
}
