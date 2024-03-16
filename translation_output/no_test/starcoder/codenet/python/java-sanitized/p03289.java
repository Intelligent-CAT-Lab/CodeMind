import java.util.*;
public class p03289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int flag = 0;
        if(s.charAt(0)!= 'A'){
            flag = 1;
        }
        int count = 0;
        for(int i = 2; i < s.length()-1; i++){
            if(s.charAt(i) == 'C'){
                count++;
            }
        }
        if(count!= 1){
            flag = 1;
        }
        int count2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i).toUpperCase()){
                count2++;
            }
        }
        if(count2!= 2){
            flag = 1;
        }
        if(flag == 0){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}