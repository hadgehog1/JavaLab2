package by.labodel.attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {

    public PoisonJab() {
        super(Type.POISON, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Poison Jab";
    }
}