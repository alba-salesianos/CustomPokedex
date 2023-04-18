package utilities;

import Types.Pokemon;

public class ListaPokemon {
    //private int listSize = 1;
    private int listSize = 0;
    private Pokemon pokemonList[] = new Pokemon[1];

    public ListaPokemon(){
        this.pokemonList = pokemonList;
    }

    public void addPokemon(Pokemon newPokemon){
        pokemonList[listSize]= newPokemon;
        listSize++;

        Pokemon tempPokemonList[] = new Pokemon[listSize + 1];

        for (int i = 0; i < pokemonList.length; i++) {
            tempPokemonList[i] = pokemonList[i];
        }

        this.pokemonList = tempPokemonList;
    }

    public void deletePokemon(String pokemonName){
        boolean isDeleted = false;
        int registeredPokemon = 0;
        int counter = 0;
        for (int i = 0; i < pokemonList.length-1; i++) {
            if(pokemonList[i].getName().equals(pokemonName)){
                pokemonList[i] = null;
                isDeleted = true;
            } else {
                registeredPokemon++;

            }
        }

        Pokemon tempPokemonList[] = new Pokemon[registeredPokemon+1];


        for (int j = 0; j < pokemonList.length; j++) {

            if(pokemonList[j]!=null){
                tempPokemonList[counter] = pokemonList[j];
                counter++;
            }

        }

        this.pokemonList = tempPokemonList;

        if(isDeleted == true) {
            System.out.println("Pokemon eliminado.");
        } else {
            System.out.println("Este pokemon no se encuentra en la lista.");
        }

    }

    public Pokemon returnPokemon(int position){
        if(pokemonList[position]!=null){
            return pokemonList[position];
        } else {
            return null;
        }
    }

    public void showPokemonList(){
        String msg = "";
        for (int i = 0; i < pokemonList.length; i++) {
            if(pokemonList[i]!=null){
                msg += "\n" + pokemonList[i].toString();
            }
        }
        System.out.println(msg);
    }
}
