import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p00084 {
    public static void main(String[] args) {
        String code = "Rain, rain, go to Spain.";
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] splitCode = code.split(" ");

        List<String> list = new ArrayList<>();

        for (String word : splitCode) {
            if (word.length() >= 3 && word.length() <= 6) {
                list.add(word);
            }
        }

        for (String word : list) {
            System.out.print(word + " ");
        }
    }
}