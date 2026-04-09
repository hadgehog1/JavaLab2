package by.labodel.attack.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {

    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        if (def.getCondition() == Status.SLEEP) {
            return super.checkAccuracy(att, def);
        }
        return false;
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage / 2));
    }

    @Override
    protected String describe() {
        return "использует Dream Eater";
    }
}