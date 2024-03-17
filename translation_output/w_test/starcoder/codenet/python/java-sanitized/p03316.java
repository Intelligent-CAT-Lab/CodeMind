import java.util.*;
public class p03316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n.length();i++){
            sum += n.charAt(i)-'0';
        }
        if(n%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}