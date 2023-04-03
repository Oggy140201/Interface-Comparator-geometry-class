import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        Shape circle = new Circle(1);
        Shape circle1 = new Circle(2);
        Shape rectangle = new Rectangle(3,4);
        Shape rectangle1 = new Rectangle(4,5);
        Shape square = new Square(5);

        ArrayList<Shape> arrayList = new ArrayList<Shape>();
        arrayList.add(circle);
        arrayList.add(circle1);
        arrayList.add(rectangle);
        arrayList.add(rectangle1);
        arrayList.add(square);
        for(int i = 0; i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        Collections.sort(arrayList);
        for (Shape shape : arrayList) {
            System.out.println(shape.getPerimeter());
        }
    }
}