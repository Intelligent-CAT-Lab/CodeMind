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
System.out.println("[INST]14;intputString;br.readLine();"+intputString);

            Set<String> vowelSet = new HashSet<>();
            vowelSet.add("a");
System.out.println("[INST]17;None;vowelSet.add('a');"+vowelSet.add("a"));
            vowelSet.add("e");
System.out.println("[INST]18;None;vowelSet.add('e');"+vowelSet.add("e"));
            vowelSet.add("i");
System.out.println("[INST]19;None;vowelSet.add('i');"+vowelSet.add("i"));
            vowelSet.add("o");
System.out.println("[INST]20;None;vowelSet.add('o');"+vowelSet.add("o"));
            vowelSet.add("u");
System.out.println("[INST]21;None;vowelSet.add('u');"+vowelSet.add("u"));

            if (vowelSet.contains(intputString)) {
System.out.println("[INST]23;None;vowelSet.contains(intputString);"+vowelSet.contains(intputString));
                System.out.println("vowel");
            } else {
                System.out.println("consonant");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
System.out.println("[INST]31;None;System.exit(0);"+System.exit(0));
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
System.out.println("[INST]34;None;System.exit(0);"+System.exit(0));
        }
    }
}