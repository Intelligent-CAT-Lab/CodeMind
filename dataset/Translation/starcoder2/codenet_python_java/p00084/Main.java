import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] codeArray = code.split(" ");
        String[] list = new String[codeArray.length];
        int count = 0;
        for (int i = 0; i < codeArray.length; i++) {
            if (codeArray[i].length() >= 3 && codeArray[i].length() <= 6) {
                list[count] = codeArray[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(list[i] + " ");
        }
    }
}