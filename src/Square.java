public class Square extends Rectangle {


    public Square(double length) {
       super(length, length);
    }

    public Square() {
    }


    @Override
    public double getPerimeter(){
        return super.getLength() *4;
    }

    @Override
    public double getArea(){
        return super.getLength() * super.getLength();
    }

    @Override
    public String toString() {
        return "Square{" +
                "daicanh=" + super.getLength() +
                '}';
    }
}
