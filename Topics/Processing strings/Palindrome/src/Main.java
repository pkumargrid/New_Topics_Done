import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(new StringBuilder(s).reverse().toString().equals(s)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}