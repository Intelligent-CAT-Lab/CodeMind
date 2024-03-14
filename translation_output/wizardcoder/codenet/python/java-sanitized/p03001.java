import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float mx = w/2;
        float my = h/2;
        float res[] = new float[2];
        res[0] = w*h/2;
        if(x==mx && y==my){
            res[1] = 1;
        }
        else{
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}