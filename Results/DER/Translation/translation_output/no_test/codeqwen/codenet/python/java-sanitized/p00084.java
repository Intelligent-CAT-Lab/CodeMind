import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p00084 {
    public static void main(String[] args) {
        String code = "your input here";
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] codeArray = code.split(" ");

        List<String> list = new ArrayList<>();

        for (String var : codeArray) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for (String var : list) {
            System.out.print(var + " ");
        }
    }
}