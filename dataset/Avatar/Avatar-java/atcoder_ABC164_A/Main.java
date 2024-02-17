import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        for (int i = 0; i >= 0; i++) {
            try {
                scList.add(scan.nextLine());
            } catch (Exception e) {
                break;
            }
        }

        String[] numlist = scList.get(0).split(" ▁ ");
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);

        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}