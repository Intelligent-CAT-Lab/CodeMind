
    import java.math.BigInteger;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            String s;
            Scanner reader = new Scanner(System.in);
            s = reader.nextLine();

            String[] str;
            str = s.split(" ");
            BigInteger a = new BigInteger(str[0]);
            BigInteger b = new BigInteger(str[1]);

            BigInteger c = a.add(b);

            System.out.println(c);
        }
    }

