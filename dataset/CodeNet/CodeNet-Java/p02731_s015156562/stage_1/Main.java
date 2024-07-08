import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double l = scan.nextInt();
        System.out.println(Math.pow(l / 3, 3));
        scan.close();
    }
}