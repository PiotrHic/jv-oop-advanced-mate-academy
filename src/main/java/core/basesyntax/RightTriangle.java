package core.basesyntax;

public class RightTriangle extends Figure implements Draw{

    public RightTriangle(int first_side, int second_side) {
        this.first_side = first_side;
        this.second_side = second_side;
    }

    int first_side;
    int second_side;
    double area = (first_side * second_side) / 2;

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("RightTriangle has a color: ").append(color).append(" and area of: ")
                .append(area).append(" m2");
        System.out.println(sb.toString());
    }
}
