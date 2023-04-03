public abstract class Shape implements Comparable<Shape> {

    public Shape() {
    }

    @Override
    public int compareTo(Shape shape) {
        return (int) (this.getArea() - shape.getArea());
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
