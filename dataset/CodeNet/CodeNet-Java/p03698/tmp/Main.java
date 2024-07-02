import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
System.out.println("[INST]13;inputString;Arrays.asList(br.readLine().split(''));"+inputString);
System.out.println("[INST]13;None;br.readLine().split('');"+br.readLine().split(""));
System.out.println("[INST]13;None;br.readLine();"+br.readLine());
            Set<String> removeDuplication = new HashSet<>();
            for (String str : inputString) {
                removeDuplication.add(str);
System.out.println("[INST]16;None;removeDuplication.add(str);"+removeDuplication.add(str));
            }

            String ans = "no";
            if (inputString.size() == removeDuplication.size()) {
System.out.println("[INST]20;None;inputString.size();"+inputString.size());
System.out.println("[INST]20;None;removeDuplication.size();"+removeDuplication.size());
                ans = "yes";
            }

            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
System.out.println("[INST]27;None;System.exit(0);"+System.exit(0));
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
System.out.println("[INST]30;None;System.exit(0);"+System.exit(0));
        }
    }
}