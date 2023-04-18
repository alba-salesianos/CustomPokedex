import Types.Legendary;
import Types.Pokemon;
import utilities.ListaPokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaPokemon spottedPokemon = new ListaPokemon();
        ListaPokemon caughtPokemon = new ListaPokemon();

        int option = -1;

        Scanner keyboard = new Scanner(System.in);

        while (option != 6) {

            String boxGraphic = "\n╔═════════════════════════════════════════╗";
            boxGraphic += "\n║              P O K É D E X              ║";
            boxGraphic += "\n╟─────────────────────────────────────────╢";
            boxGraphic += "\n║        ¡Te damos la bienvenida          ║ ";
            boxGraphic += "\n║             a esta Pokédex!             ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n║            Elige una opción             ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n║ 1. Añadir Pokémon avistado              ║";
            boxGraphic += "\n║ 2. Añadir avistamiento legendario       ║";
            boxGraphic += "\n║ 3. Pasar a capturados                   ║";
            boxGraphic += "\n║ 4. Mostrar lista de avistados           ║";
            boxGraphic += "\n║ 5. Mostrar lista de capturados          ║";
            boxGraphic += "\n║ 6. Cerrar la Pokédex                    ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n╚═════════════════════════════════════════╝";

            System.out.println(boxGraphic);
            option = keyboard.nextInt();
            keyboard.nextLine();


            switch (option) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;


                case 4:

                    break;

                case 6:

                    break;

                default:

                    break;
            }

        }

        keyboard.close();










        Pokemon pikachu = new Pokemon("Pikachu","Electric","1'04\"",13.2,"When it is angered, it immediately discharges the energy stored in the pouches in its cheeks.");

        Legendary articuno = new Legendary("Articuno", "Freeze", "5'07\"", 122.1, "It’s said that this Pokémon’s beautiful blue wings are made of ice. Articuno flies over snowy mountains, its long tail fluttering along behind it.", "Seafoam Islands");

        Pokemon nintetales = new Pokemon("Ninetales","Fire","3'07\"",43.9,"It is said to live 1,000 years, and each of its tails is loaded with supernatural powers.");











    }

}