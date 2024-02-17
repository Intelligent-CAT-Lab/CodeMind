import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
    
        String res;
        if('A' <= s[0] && s[0] <='Z'){
            res = "A";
        }else{
            res ="a";
        }
        System.out.println(res);
        }
    }