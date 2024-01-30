import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch).append(ch);
        }
        System.out.println(sb);
    }
}