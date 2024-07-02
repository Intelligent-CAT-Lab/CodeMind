import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
System.out.println("[INST]15;None;scanner.hasNextLine();"+scanner.hasNextLine());
            lineList.add(scanner.nextLine());
System.out.println("[INST]16;None;lineList.add(scanner.nextLine());"+lineList.add(scanner.nextLine()));
System.out.println("[INST]16;None;scanner.nextLine();"+scanner.nextLine());
        }
        return lineList;
    }

    private static Consumer<List<String>> solve() {
        return args -> {
            boolean ans = false;
            for (int i = 0; i < 3; i++) {
                ans |= args.get(0).charAt(i) == args.get(0).charAt(i + 1);
System.out.println("[INST]25;None;args.get(0).charAt(i);"+args.get(0).charAt(i));
System.out.println("[INST]25;None;args.get(0);"+args.get(0));
System.out.println("[INST]25;None;args.get(0).charAt(i + 1);"+args.get(0).charAt(i + 1));
System.out.println("[INST]25;None;args.get(0);"+args.get(0));
            }
            System.out.println(ans ? "Bad" : "Good");
        };
    }

}
