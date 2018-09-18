/**
 *   Name: Gronkiewicz, Catherine
 *   Homework: #3
 *   Due: Wednesday, February 21, 2018
 *   Course: cs14103-w18
 *
 *   Description: Taking classes from ShapeQ and adding exception 
 *   handlings for 0 or negative dimensions
 */

public class Circle implements Shape {
    
    private double radius;
    static Circle UNIT = new Circle(1.0);

    public Circle (double radius) {
       try {
          this.radius = radius;
          if(radius < 1)
             throw new IllegalArgumentException();
       }
       catch (IllegalArgumentException e) {
          System.out.println("Invalid length");
       }
    }

    @Override
    public double area () {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter () {
        return 2* Math.PI * radius;
    }
    
}
