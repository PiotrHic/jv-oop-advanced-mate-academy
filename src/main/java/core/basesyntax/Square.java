package core.basesyntax;

public class Square extends Figure implements Draw{

    public Square(int square_wall, String color) {
        this.square_wall = square_wall;
        this.square_area = square_wall*square_wall;
        this.color = color;
    }

    int square_wall;
    double square_area;

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Square has a color: ").append(color).append(" and square area of: ")
                .append(square_wall).append(" m2");
        System.out.println();
    }
}
