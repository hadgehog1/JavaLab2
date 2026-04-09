package by.labodel.pokemons;

import by.labodel.attack.PoisonJab;
import ru.ifmo.se.pokemon.Type;

public final class Poliwrath extends Poliwhirl {

    public Poliwrath(String name, int level) {
        super(name, level);
        this.setStats(90, 95, 95, 70, 90, 70);
        this.addType(Type.FIGHTING);
        this.addMove(new PoisonJab());
    }
}