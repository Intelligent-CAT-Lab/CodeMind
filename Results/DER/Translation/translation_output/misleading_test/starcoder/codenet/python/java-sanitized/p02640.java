import java.util.*;
public class p02640 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for(int a = 0; a <= x; a++){
            int b = x - a;
            if(2*a + 4*b == y){
                count = 1;
                break;
            }
        }
        if(count == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}