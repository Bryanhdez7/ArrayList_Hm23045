import java.util.ArrayList;

public class Ej002 {
    public static void main(String[] args)  {
        
        // ArrayList de cadenas
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

        // ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // ArrayList de caracteres
        ArrayList<Character> letras = new ArrayList<>();
        for (char c = 'A'; c <= 'J'; c++) {
            letras.add(c);
        }

        // Imprimir elementos del ArrayList de nombres de Pokémon
        System.out.println("Nombres de Pokémon:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }

        // Imprimir elementos del ArrayList de números
        System.out.println("\nNúmeros:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Imprimir elementos del ArrayList de letras
        System.out.println("\nLetras:");
        for (char letra : letras) {
            System.out.println(letra);
        }

    }
}
