import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03888 {

    public static void main(String[] args) {
        List<String[]> inputData = getInputData();
        
        int r1 = Integer.parseInt(inputData.get(0)[0]);
        int r2 = Integer.parseInt(inputData.get(0)[1]);

        System.out.println(1 / ((double) (r2 + r1) / (r1 * r2)));
    }

    public static List<String[]> getInputData() {
        List<String[]> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        result.add(data.split(" "));

        boolean flag = true;

        try {
            while (flag) {
                data = scanner.nextLine();
                if (!data.equals("")) {
                    result.add(data.split(" "));
                    flag = true;
                } else {
                    flag = false;
                }
            }
        } finally {
            scanner.close();
        }

        return result;
    }
}