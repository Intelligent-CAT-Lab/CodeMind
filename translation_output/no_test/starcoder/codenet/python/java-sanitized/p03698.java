import java.util.*;
public class p03698 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>=2){
                System.out.println("no");
                break;
            }
        }
        if(count==1){
            System.out.println("yes");
        }
    }
}