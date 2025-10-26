package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(){
        int number = random.nextInt(4);
        Figure randomFigure = null;
        switch (number) {
            case 0:
                randomFigure = new Circle(random.nextInt(), colorSupplier.getRandomColor());
                break;
            case 1:
                randomFigure = new IsoscelesTrapezoid(
                        random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
                break;
            case 2:
                randomFigure = new Rectangle(
                        random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
                break;
            case 3:
                randomFigure = new RightTriangle(
                        random.nextInt(),random.nextInt(), colorSupplier.getRandomColor());
                break;
            case 4:
                randomFigure = new Square(
                        random.nextInt(), colorSupplier.getRandomColor());
                break;
            default:
                break;
        }

        return randomFigure;
    }
}
