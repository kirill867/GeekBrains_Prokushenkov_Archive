package lesson_2.task_2;

public class Rectangle implements I_Shape{
    private double width;
    private double height;

    public Rectangle(){
        width = 20.0;
        height = 50.0;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public Double calculateArea(){
        Double area = width * height;
        return area;
    }
    public Double calculatePerimeter(){
        Double perim = 2 * (width + height);
        return perim;
    }

    @Override
    public String toString() {
        return "Площадь прямоугольника = " + calculateArea() + ", периметр = " + calculatePerimeter();
    }
}
