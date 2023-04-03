public class Rectangle extends Shape {
    private double length;
    private double width ;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double wide) {
        this.width = wide;
    }

    public double getWidth() {
        return width;
    }


    @Override
     public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return (length + width) * 2;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wide=" + width +
                '}';
    }
}
