import java.util.*;
public class p03402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int h = (A-1)/50;
        int w = (A-1)%50;
        for(int i=0;i<h;i++)
            for(int j=0;j<50;j++)
                System.out.print("#");
        for(int i=0;i<w;i++)
            System.out.print("#");
        System.out.println();
        for(int i=0;i<h;i++)
            for(int j=0;j<50;j++)
                System.out.print(".");
        for(int i=0;i<w;i++)
            System.out.print(".");
        System.out.println();
    }
}