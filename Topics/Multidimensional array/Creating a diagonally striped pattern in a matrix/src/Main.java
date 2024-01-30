import java.util.Scanner;

public class Main{

    public static void printPattern(int n) {
        // You should declare a two-dimensional array here.

        // You should write a nested for loop to iterate over element in the array.
        // In the for loop you can identify the positions that should hold '#' and ' '. 

        // You should print out the elements of each row of the array. Use 'System.out.print' 
        // to avoid automatic newline after every element and 'System.out.println' 
        // at the end of every row to print a newline.
//        for(int i = 0; i < n/2 + 1; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print(" ");
//            }
//            System.out.print("#");
//            int want = n-2;
//            for(int j = want - 2*i; j >= 1; j--){
//                System.out.print(" ");
//            }
//            if(i != n/2)
//                System.out.println("#");
//        }
//        System.out.println();
//        for(int i = 1; i < n/2 + 1; i++){
//            for(int j = n/2; j > i; j--){
//                System.out.print(" ");
//            }
//            System.out.print("#");
//            for(int j = 1; j <= 2*i-1; j++){
//                System.out.print(" ");
//            }
//            System.out.println("#");
//        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
}