import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] c= sc.nextLine().split(" ");
        String s = c[0];
        int n = Integer.parseInt(c[1]);
        if(n > s.length()){
            System.out.println(s);
        }
        else{
            System.out.println(s.substring(n) + s.substring(0,n));
        }
    }
}