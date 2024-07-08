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
var newVariable_0 = br.readLine().split("");var newVariable_1 = br.readLine();            List<String> inputString = Arrays.asList(newVariable_1.split(""));
            Set<String> removeDuplication = new HashSet<>();
            for (String str : inputString) {
var newVariable_2 = removeDuplication.add(str);            }

            String ans = "no";
var newVariable_3 = inputString.size();var newVariable_4 = removeDuplication.size();            if (inputString.size() == newVariable_4) {
                ans = "yes";
            }

            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}