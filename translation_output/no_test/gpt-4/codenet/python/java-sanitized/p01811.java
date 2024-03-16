import java.util.*;

public class p01811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        List<String> log = new ArrayList<>();

        while (s.length() > 3 && f) {
            f = false;
            if (s.startsWith("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log.add("A");
                f = true;
            } else if (s.endsWith("ABC")) {
                s = s.replaceAll("ABC(?=\\z)", "C");
                log.add("C");
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceFirst("ABC", "B");
                log.add("B");
                f = true;
            }
        }

        if (!s.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }

        int l = log.size();
        for (int i = 0; i < l; i++) {
            s = s.replace(log.get(l - 1 - i), "ABC");
        }

        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}