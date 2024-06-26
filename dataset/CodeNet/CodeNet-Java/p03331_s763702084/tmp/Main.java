import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        init(System.in);
        int n = nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int sum = digitSum(i) + digitSum(n - i);
            min = Math.min(min, sum);
System.out.println("[INST]11;min;Math.min(min, sum);"+min);
        }
        System.out.println(min);
    }

    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
System.out.println("[INST]37;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
            read = reader.readLine();
System.out.println("[INST]38;read;reader.readLine();"+read);
            if (read == null || read.equals(""))
System.out.println("[INST]39;None;read.equals('');"+read.equals(""));
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
System.out.println("[INST]44;None;tokenizer.nextToken();"+tokenizer.nextToken());
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

//    private static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    private static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    private static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}

