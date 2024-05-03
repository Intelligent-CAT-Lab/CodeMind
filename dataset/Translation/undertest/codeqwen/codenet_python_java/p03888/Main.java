import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayResult = new String[100];
        int i = 0;
        arrayResult[i] = scanner.nextLine();
        i++;
        boolean flg = true;
        try {
            while (flg) {
                String data = scanner.nextLine();
                if (!data.equals("")) {
                    arrayResult[i] = data;
                    i++;
                    flg = true;
                } else {
                    flg = false;
                }
            }
        } finally {
            int r1 = Integer.parseInt(arrayResult[0].split(" ")[0]);
            int r2 = Integer.parseInt(arrayResult[0].split(" ")[1]);
            System.out.println(1.0 / ((r2 + r1) / (r1 * r2)));
        }
    }
}