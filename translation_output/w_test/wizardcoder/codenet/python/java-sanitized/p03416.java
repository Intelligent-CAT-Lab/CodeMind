import java.util.*;

public class p03416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int t = sc.nextInt();
        int count = 0;
        for(int i=f; i<=t; i++){
            if(isPalindrome(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(int num){
        String str = String.valueOf(num);
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!= str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}