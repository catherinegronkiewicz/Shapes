/**
 *   Name: Gronkiewicz, Catherine
 *   Homework: #3
 *   Due: Wednesday, February 21, 2018
 *   Course: cs14103-w18
 *
 *   Description: Taking classes from ShapeQ and adding exception
 *   handlings for 0 or negative dimensions
 */

public class Rectangle implements Shape {
    
    private double length, width;

    public Rectangle (double length, double width) {
       try {
          this.length = length;
          this.width = width;
          if (length < 1 || width < 1)
             throw new IllegalArgumentException();
       }
       catch (IllegalArgumentException e) {
          System.out.println("Invalid length");
       }
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length * width);
    }
    
}
