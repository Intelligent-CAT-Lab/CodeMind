import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int i = 0;
        while(((X-1)*i +1 )<Y){
            i++;
        }
        System.out.println(i);
    }
}