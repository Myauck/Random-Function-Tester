package src.functions;

import src.interfaces.RandomFunctions;

import java.util.Random;

public class RandomDoubleFunction extends RandomFunctions {
    public RandomDoubleFunction(Random random) {
        super("Double", random);
    }

    @Override
    public void callFunction() {
        random.nextDouble();
    }
}