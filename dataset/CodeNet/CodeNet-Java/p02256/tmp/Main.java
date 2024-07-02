import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
System.out.println("[INST]5;input;br.readLine().split(' ');"+input);
System.out.println("[INST]5;None;br.readLine();"+br.readLine());
        int a = Integer.parseInt(input[0]);
System.out.println("[INST]6;a;Integer.parseInt(input[0]);"+a);
        int b = Integer.parseInt(input[1]);
System.out.println("[INST]7;b;Integer.parseInt(input[1]);"+b);

        System.out.println(GCD(a, b));
    }

    public static int GCD (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) return b;
        else return GCD (b, a%b);
System.out.println("[INST]19;None;GCD (b, a%b);"+GCD (b, a%b));
    }
}