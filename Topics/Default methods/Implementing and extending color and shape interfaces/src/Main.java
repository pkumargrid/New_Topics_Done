// Both interfaces 'Shape' and 'Colorable' need to be declared here
// Remember to add the default methods 'name()' and 'color()'


// Implement the interfaces in the 'Circle' class here
// Make sure to override the 'name()' method


// Create the 'ColoredCircle' class that extends 'Circle' and overrides 'color()'


// Finally, create a method that takes the string input and returns the name and color of the respective object

import java.util.Scanner;

interface Shape{
    default String name(){
        return "Generic Shape";
    }
}
interface Color{
    default String color(){
        return "No Color";
    }
}

class Circle implements Shape, Color{
    public String name(){
        return "Circle";
    }
}
class ColoredCircle extends Circle{
    public String color(){
        return "Red";
    }
}

public class Main {

    // Add your method here

    public static void main(String[] args) {
        // Use this main method for testing your implementation
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Circle circle = null;
        if(type.equals("Circle")){
            circle = new Circle();
            System.out.println(circle.name());
            System.out.println(circle.color());
        }
        else{
            circle = new ColoredCircle();
            System.out.println(circle.name());
            System.out.println(circle.color());
        }
    }
}