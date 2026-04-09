package by.labodel.pokemons;

import by.labodel.attack.special.ChargeBeam;
import by.labodel.attack.special.Discharge;
import by.labodel.attack.special.DreamEater;
import by.labodel.attack.special.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rotom extends Pokemon {

    public Rotom(String name, int level) {
        super(name, level);

        this.setStats(50, 50, 77, 95, 77, 91);
        this.setType(Type.ELECTRIC);
        this.addType(Type.GHOST);
        this.setMove(new Discharge(), new ChargeBeam(), new Thunder(), new DreamEater());
    }
}