import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object msg = scanner.nextLine();    
        if(msg instanceof String str && !str.isEmpty()){
            System.out.printf("The variable is not empty, the length is %d",str.length());
        }
        // Write your code here
    }
}