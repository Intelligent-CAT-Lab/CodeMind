
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s;
        Scanner reader = new Scanner(System.in);
        s = reader.nextLine();
System.out.println("[INST]8;s;reader.nextLine();"+s);

        String[] str;
        str = s.split(" ");
System.out.println("[INST]11;str;s.split(' ');"+str);
        BigInteger a = new BigInteger(str[0]);
        BigInteger b = new BigInteger(str[1]);

        BigInteger c = a.subtract(b);
System.out.println("[INST]15;c;a.subtract(b);"+c);

        System.out.println(c);
    }
}

