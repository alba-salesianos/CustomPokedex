import Types.Legendary;
import Types.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu","Electric","1'04\"",13.2,"When it is angered, it immediately discharges the energy stored in the pouches in its cheeks.");

        System.out.println(pikachu);

        Legendary articuno = new Legendary("Articuno", "Freeze", "5'07\"", 122.1, "It’s said that this Pokémon’s beautiful blue wings are made of ice. Articuno flies over snowy mountains, its long tail fluttering along behind it.", "??????");

        System.out.println(articuno);

        // TODO: add and commit this

    }

}