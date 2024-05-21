import java.util.*;

public class p03888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> arr_data = new ArrayList<>();
        String[] data = sc.nextLine().split(" ");
        arr_data.add(data);
        int flg = 1;
        while (flg == 1) {
            data = sc.nextLine().split(" ");
            if (!data[0].equals("")) {
                arr_data.add(data);
            } else {
                flg = 0;
            }
        }
        int r1 = Integer.parseInt(arr_data.get(0)[0]);
        int r2 = Integer.parseInt(arr_data.get(0)[1]);
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}