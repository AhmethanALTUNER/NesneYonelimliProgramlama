
package testrectangle;

public class Rectangle {
    public double widht=1;
    public double height=1;
    
    public Rectangle(){
    }
    
    public Rectangle(double widht1, double height1){
        widht=widht1;
        height=height1;
    }
    
    public double getArea(){
        return widht*height;
    }
    
    public double getPerimeter(){
        return 2*(widht+height);
    }
}
