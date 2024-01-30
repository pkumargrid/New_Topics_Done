import java.util.*;

public class Main {
    public static boolean check(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'y'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            boolean abhi = check(s.charAt(i));
            int cnt = 1;
            int j = i + 1;
            for(; j < s.length(); j++){
                if(abhi == check(s.charAt(j))){
                    cnt++;
                }
                else{
                    break;
                }
                if(cnt == 3) break;
            }
            if(cnt == 3){
                ans++;
            }
            i= j-1;
        }
        System.out.println(ans);
    }
}