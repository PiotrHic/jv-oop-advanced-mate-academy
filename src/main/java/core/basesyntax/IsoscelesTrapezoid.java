package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Draw{

    public IsoscelesTrapezoid(int first_wall, int second_wall) {
        this.first_wall = first_wall;
        this.second_wall = second_wall;
    }

    int first_wall;
    int second_wall;
    double square_area = first_wall * second_wall;
    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("IsoscelesTrapezoid: ").append(color).append(" and area of: ")
                .append(square_area).append(" m2");
        System.out.println(sb.toString());
    }
}
