package by.labodel;

import by.labodel.pokemons.Poliwag;
import by.labodel.pokemons.Poliwhirl;
import by.labodel.pokemons.Poliwrath;
import by.labodel.pokemons.Quagsire;
import by.labodel.pokemons.Rotom;
import by.labodel.pokemons.Wooper;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon poliwrath = new Poliwrath("Посейдон", 75);
        Pokemon rotom = new Rotom("Вольт", 78);
        Pokemon quagsire = new Quagsire("Тина", 72);

        battle.addAlly(poliwrath);
        battle.addAlly(rotom);
        battle.addAlly(quagsire);

        Pokemon poliwhirl = new Poliwhirl("Нептун", 74);
        Pokemon wooper = new Wooper("Сплин", 70);
        Pokemon poliwag = new Poliwag("Капля", 73);

        battle.addFoe(poliwhirl);
        battle.addFoe(wooper);
        battle.addFoe(poliwag);

        battle.go();
    }
}