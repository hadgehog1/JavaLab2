package by.labodel.pokemons;

import by.labodel.attack.Slam;
import by.labodel.attack.special.Blizzard;
import by.labodel.attack.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wooper extends Pokemon {

    public Wooper(String name, int level) {
        super(name, level);

        this.setStats(55, 45, 45, 25, 25, 15);
        this.setType(Type.WATER);
        this.addType(Type.GROUND);

        this.setMove(new Slam(), new Blizzard(), new Rest());
    }
}