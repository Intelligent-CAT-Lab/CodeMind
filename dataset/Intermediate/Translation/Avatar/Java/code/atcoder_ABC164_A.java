import java.util.*;

public class atcoder_ABC164_A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);

        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}