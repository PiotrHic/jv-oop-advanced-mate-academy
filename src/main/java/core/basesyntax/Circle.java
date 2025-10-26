package core.basesyntax;

public class Circle extends Figure implements Draw{

    int radius;
    double area = radius * Math.PI;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle has a color: ").append(color).append(" and area of: ")
                .append(area).append(" m2");
        System.out.println(sb.toString());
    }
}
