import java.util.*;
public class p04019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("N","").replaceAll("S","").replaceAll("E","").replaceAll("W","");
        if(s.length()==0){
            System.out.println("Yes");
        }
        else if(s.length()==1){
            System.out.println("No");
        }
        else if(s.length()==2){
            if(s.contains("N") && s.contains("S")){
                System.out.println("Yes");
            }
            else if(s.contains("E") && s.contains("W")){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            System.out.println("No");
        }
    }
}