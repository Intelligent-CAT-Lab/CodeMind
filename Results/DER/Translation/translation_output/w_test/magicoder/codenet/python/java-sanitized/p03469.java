import java.util.Scanner;

public class p03469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String year = "2018";
        System.out.println(year + date.substring(4));
    }
}



You can test this code with the following test input:


2017/01/07


And the expected output will be:


2018/01/07