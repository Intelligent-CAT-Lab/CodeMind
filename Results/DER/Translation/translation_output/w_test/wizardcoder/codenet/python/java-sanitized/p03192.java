import java.util.*;

public class p03192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int count = 0;
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)=='2'){
                count++;
            }
        }
        System.out.println(count);
    }
}