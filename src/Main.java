import Types.Legendary;
import Types.Pokemon;
import utilities.ListaPokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu","Electric","1'04\"",13.2,"When it is angered, it immediately discharges the energy stored in the pouches in its cheeks.");

        Legendary articuno = new Legendary("Articuno", "Freeze", "5'07\"", 122.1, "It’s said that this Pokémon’s beautiful blue wings are made of ice. Articuno flies over snowy mountains, its long tail fluttering along behind it.", "Seafoam Islands");

        Pokemon nintetales = new Pokemon("Ninetales","Fire","3'07\"",43.9,"It is said to live 1,000 years, and each of its tails is loaded with supernatural powers.");


        ListaPokemon pokemones = new ListaPokemon();

        pokemones.addPokemon(pikachu);
        pokemones.addPokemon(articuno);
        pokemones.addPokemon(nintetales);

        System.out.println(pokemones);

        pokemones.deletePokemon("Ditto");

        System.out.println(pokemones);




    }

}