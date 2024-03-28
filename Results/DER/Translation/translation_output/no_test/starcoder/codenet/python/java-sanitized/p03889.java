import java.util.*;
public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='p'){
                t+='q';
            }
            else if(s.charAt(i)=='q'){
                t+='p';
            }
            else if(s.charAt(i)=='b'){
                t+='d';
            }
            else if(s.charAt(i)=='d'){
                t+='b';
            }
        }
        if(s.equals(t)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}