package src.functions;

import src.interfaces.RandomFunctions;

import java.util.Random;

public class RandomBooleanFunction extends RandomFunctions {
    public RandomBooleanFunction(Random random) {
        super("Boolean", random);
    }

    @Override
    public void callFunction() {
        random.nextBoolean();
    }
}