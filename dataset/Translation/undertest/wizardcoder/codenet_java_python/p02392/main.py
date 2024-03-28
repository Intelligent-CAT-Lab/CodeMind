import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02392 {

    public static void main(String[] args) throws Exception {
        String inStr;
        inStr = inp();
        String[] in;
        in = inStr.split(" ");

        int a = Integer.valueOf(in[0]);
        int b = Integer.valueOf(in[1]);
        int c = Integer.valueOf(in[2]);

        if (a < b and b < c)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static String inp() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}




import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02392 {

    public static void main(String[] args) throws Exception {
        String inStr;
        inStr = inp();
        String[] in;
        in = inStr.split(" ");

        int a = int(in[0]);
        int b = int(in[1]);
        int c = int(in[2]);

        if (a < b < c)
            print("Yes");
        else
            print("No");

    }

    private static String inp() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}