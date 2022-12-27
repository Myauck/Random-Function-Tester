package src;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Main.class.getResourceAsStream("bonsoir.txt");
        /*
         * Random random = new Random();
         * 
         * RandomFunctions[] functions = {
         * new RandomBooleanFunction(random),
         * new RandomIntFunction(random),
         * new RandomDoubleFunction(random),
         * new RandomFloatFunction(random),
         * new RandomLongFunction(random)
         * };
         * 
         * int counter = random.nextInt(1000001) + 1;
         * 
         * RandomTimer randomTimer = new RandomTimer(counter);
         * 
         * String[] lines = new String[functions.length];
         * 
         * int j = 0;
         * while (j < 1000) {
         * int i = 0;
         * counter = random.nextInt(10000001) + 1;
         * randomTimer.setCounter(counter);
         * 
         * for (RandomFunctions randomFunction : functions) {
         * long time = randomTimer.run(randomFunction);
         * lines[i] = String.format("%s,%s,%s",
         * randomFunction.getName().toLowerCase(),
         * time,
         * counter);
         * 
         * i++;
         * }
         * 
         * append(lines);
         * 
         * }
         */

    }

    public static void append(String[] contents) {
        try {
            String filename = "";
            FileWriter fw = new FileWriter(filename, true);
            for (String content : contents)
                fw.write(content + "\n");
            fw.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

}
