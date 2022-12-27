package src.interfaces;

import java.util.Random;

public abstract class RandomFunctions implements FunctionInterface {

    protected final Random random;
    protected final String name;

    public RandomFunctions(final String name, final Random random) {
        this.name = name;
        this.random = random;
    }

    public String getName() {
        return name;
    }

    public Random getRandom() {
        return random;
    }

}