import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = -1;
        int ans = -1;
        while(n-- > 0){
            int v = scanner.nextInt();
            if(prev != -1){
                ans = Math.max(ans,prev*v);
            }
            prev = v;
        }
        System.out.println(ans);
    }
}