package src.functions;

import src.interfaces.RandomFunctions;

import java.util.Random;

public class RandomIntFunction extends RandomFunctions {
    public RandomIntFunction(Random random) {
        super("Int", random);
    }

    @Override
    public void callFunction() {
        random.nextInt();
    }
}