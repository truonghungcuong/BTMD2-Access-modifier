public class Circle {
    private  double radius=1;
    private  String color="red";
    public Circle(){
    }
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
