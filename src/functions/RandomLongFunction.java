package src.functions;

import src.interfaces.RandomFunctions;

import java.util.Random;

public class RandomLongFunction extends RandomFunctions {
    public RandomLongFunction(Random random) {
        super("Long", random);
    }

    @Override
    public void callFunction() {
        random.nextLong();
    }
}