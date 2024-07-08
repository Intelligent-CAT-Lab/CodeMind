import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for(int i = 0;i < 3;i++)System.out.print(s.charAt(i));
    }
}