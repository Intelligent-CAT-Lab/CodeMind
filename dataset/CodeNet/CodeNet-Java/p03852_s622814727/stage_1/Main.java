import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String intputString = br.readLine();

            Set<String> vowelSet = new HashSet<>();
var newVariable_0 = vowelSet.add("a");var newVariable_1 = vowelSet.add("e");var newVariable_2 = vowelSet.add("i");var newVariable_3 = vowelSet.add("o");var newVariable_4 = vowelSet.add("u");
var newVariable_5 = vowelSet.contains(intputString);            if (newVariable_5) {
                System.out.println("vowel");
            } else {
                System.out.println("consonant");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}