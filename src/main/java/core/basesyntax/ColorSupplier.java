package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    Random random = new Random();

    public String getRandomColor(){
        Colors [] colors = Colors.values();
        int number = random.nextInt(colors.length);
        return colors[number].toString();
    }
}
