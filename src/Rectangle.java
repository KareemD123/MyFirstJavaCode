


public class Rectangle {
    private double length;
    private double width;

    public void setLength (double lengthvar){
        length = lengthvar;
    }
    public void setWidth (double widthvar){
        width = widthvar;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
}
