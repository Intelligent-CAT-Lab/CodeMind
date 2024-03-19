import java.util.*;
public class p02987 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int flag = 0;
        if(s.charAt(0) == s.charAt(1) && s.charAt(2) == s.charAt(3)){
            flag = 1;
        }
        else if(s.charAt(0) == s.charAt(2) && s.charAt(1) == s.charAt(3)){
            flag = 1;
        }
        else if(s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)){
            flag = 1;
        }
        else{
            flag = 0;
        }
        if(s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2) && s.charAt(0) == s.charAt(3)){
            flag = 0;
        }
        if(flag == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}