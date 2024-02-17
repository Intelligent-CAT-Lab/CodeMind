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
            vowelSet.add("a");
            vowelSet.add("e");
            vowelSet.add("i");
            vowelSet.add("o");
            vowelSet.add("u");

            if (vowelSet.contains(intputString)) {
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