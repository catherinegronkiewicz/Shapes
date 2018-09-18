/**
 *   Name: Gronkiewicz, Catherine
 *   Homework: #3
 *   Due: Wednesday, February 21, 2018
 *   Course: cs14103-w18
 *
 *   Description: Taking classes from ShapeQ and adding exception
 *   handlings for 0 or negative dimensions
 */

public class ShapeTest {
    
    static double area (Shape[] shapes) {      
        
        double  sum = 0;        
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        
        return sum;        
    }

    public static void main(String[] args) {
        
        Shape[] shapes = {
            new Circle(-1),
            new Rectangle(-5, 0),
            new Square(-10)
        };
        
        System.out.println("Total area = " + area(shapes));
        
        System.out.println("Check: " + (Math.PI == area(shapes) - 2));
                
        Circle c = Circle.UNIT;
        System.out.println("Perimeter of Circle: " + c.perimeter());
        System.out.println("Area of Circle: " + c.area());     
    }
    
}
