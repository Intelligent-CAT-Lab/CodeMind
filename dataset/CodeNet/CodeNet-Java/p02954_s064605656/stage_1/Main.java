
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();

var newVariable_0 = s.contains("LR");        while (newVariable_0) {
            
            int indexLR = s.indexOf("LR");
            int lastIndexOfFirstRLBlock;
            if(indexLR ==1){
                lastIndexOfFirstRLBlock = 1;
            }else {
                lastIndexOfFirstRLBlock = indexLR;
            }
            
            String firstRLBlock = s.substring(0, lastIndexOfFirstRLBlock + 1);
            s = s.substring(lastIndexOfFirstRLBlock + 1);
            result.append(makeSubResult(firstRLBlock));
        }
        result.append(makeSubResult(s));

        System.out.println(result.toString());
    }

    private static String makeSubResult(String rlBlock) {
        int lastIndexOfR = rlBlock.lastIndexOf("R");
        int countR = lastIndexOfR + 1;
var newVariable_1 = rlBlock.length();        int countL = newVariable_1 - countR;

        String result = rlBlock.replace("RL", "AB");
        result = result.replace("R", "0 ");
        result = result.replace("L", "0 ");

        int halfCountR = countR / 2;
        int halfCountL = countL / 2;

        int A = halfCountR + countR % 2 + halfCountL;
        int B = halfCountR +              halfCountL + countL % 2;

        result = result.replace("A", A + " ");
var newVariable_2 = result.replace("B", B + " ");        return newVariable_2;
    }

}