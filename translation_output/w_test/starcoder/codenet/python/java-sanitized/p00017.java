import java.util.*;
public class p00017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        while(true){
            if(s.contains("the")||s.contains("that")||s.contains("this"))
                System.out.println(s);
            else{
                String t="";
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)==' '){
                        t+=' ';
                    }
                    else{
                        t+=((char)(s.charAt(i)-1));
                    }
                }
                s=t.replace("z","a");
            }
        }
    }
}