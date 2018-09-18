/**
 *   Name: Gronkiewicz, Catherine
 *   Homework: #3
 *   Due: Wednesday, February 21, 2018
 *   Course: cs14103-w18
 *
 *   Description: Taking classes from ShapeQ and adding exception
 *   handlings for 0 or negative dimensions
 */

public class Square implements Shape {

    private double side;

    public Square (double side) {
       try {
          this.side = side;
          if (side < 1) 
             throw new IllegalArgumentException();
       }
       catch (IllegalArgumentException e) {
          System.out.println("Invalid length");
       }
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
    
}
