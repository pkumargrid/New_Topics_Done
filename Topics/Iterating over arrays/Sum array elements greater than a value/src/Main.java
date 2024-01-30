import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        int sum = 0;
        int x = scanner.nextInt();
        for(int val : arr){
            if(val > x){
                sum += val;
            }
        }
        System.out.println(sum);
    }
}