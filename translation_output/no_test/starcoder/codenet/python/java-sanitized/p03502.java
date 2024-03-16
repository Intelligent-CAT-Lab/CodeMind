import java.util.*;
public class p03502 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++){
            sum += Integer.parseInt(str.charAt(i)+"");
        }
        if(n%sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}