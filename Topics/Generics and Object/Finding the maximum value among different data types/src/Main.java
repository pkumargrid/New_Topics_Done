import java.util.*;

public class Main {
    // Get user input using Scanner
    static Scanner scanner = new Scanner(System.in);
    static String input = scanner.nextLine();

    // Split the string into parts
    static String[] parts = input.split(" ");

    // Create a generic class to hold the three data types
    // You need to implement this according to the problem statement
    static class MyGenericClass<T1, T2, T3> {
        T1 first;
        T2 second;
        T3 third;
        // Write a constructor to initialize the three variables
        MyGenericClass(T1 first, T2 second, T3 third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
        // Write a method to find the max value considering all three inputs. Consider numeric value of string.
        // Then print the max value.
        public double find(){
            double d= Double.parseDouble((String)first);
            double d1 = (double)second;
            double d2 = (double)third;
            return Math.max(d,Math.max(d1,d2));
        }

    }

    // Now, pass parts to MyGenericClass that you create. Assume that string parts are composed of numbers.

    // Print out the highest value.
    public static void main(String[] args){
        Integer a = Integer.parseInt(parts[1]);
        Double d = Double.parseDouble(parts[2]);
        MyGenericClass<String,Integer,Double> obj = new MyGenericClass<>(parts[0],a,d);
        System.out.println(obj.find());
    }
}