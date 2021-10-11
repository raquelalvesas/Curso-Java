package curingasdelimitados;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // Fazer um método para retornar a soma das áreas de uma lista de figuras.

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3, 2));
        myShapes.add(new Circle(2));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle( 2));
        myCircles.add(new Circle(2));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
