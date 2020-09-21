package h3.task1;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        width = length = side;
    }
    public Square(double side, String color, boolean filled){
        width = length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
    }

    @Override
    public void setWidth(double side) {
        width = length = side;
    }

    @Override
    public void setLength(double side) {
        width = length = side;
    }

    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
