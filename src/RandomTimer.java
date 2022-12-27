package src;

import src.interfaces.FunctionInterface;

class RandomTimer {

    private int counter;

    public RandomTimer(final int counter) {
        this.counter = counter;
    }

    public void setCounter(final int counter) {
        this.counter = counter;
    }

    public long run(FunctionInterface randomFunction) {
        long start = System.nanoTime();
        for (int i = 0; i < this.counter; i++) {
            randomFunction.callFunction();
        }
        long end = System.nanoTime();
        return end - start;
    }

    public double showSeconds(long nano) {
        return (double) (nano / 1000000000.0);
    }

    public double getFrequency() {
        return (double) this.counter;
    }

    public double getPeriod() {
        return (double) (1 / this.counter);
    }

}