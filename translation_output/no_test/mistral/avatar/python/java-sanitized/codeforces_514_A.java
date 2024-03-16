import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String ip = sc.nextLine();
        String st = " ";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                int num = Integer.parseInt(ip.charAt(i) + "");
                if (num > 4) {
                    int n = 9 - num;
                    st += Integer.toString(n);
                } else {
                    st += Integer.toString(num);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}