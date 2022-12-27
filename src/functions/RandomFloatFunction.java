package src.functions;

import src.interfaces.RandomFunctions;

import java.util.Random;

public class RandomFloatFunction extends RandomFunctions {
    public RandomFloatFunction(Random random) {
        super("Float", random);
    }

    @Override
    public void callFunction() {
        random.nextFloat();
    }
}