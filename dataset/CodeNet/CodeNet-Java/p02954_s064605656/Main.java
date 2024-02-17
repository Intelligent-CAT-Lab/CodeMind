
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();

        while (s.contains("LR")) {
            
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
        int countL = rlBlock.length() - countR;

        String result = rlBlock.replace("RL", "AB");
        result = result.replace("R", "0 ");
        result = result.replace("L", "0 ");

        int halfCountR = countR / 2;
        int halfCountL = countL / 2;

        int A = halfCountR + countR % 2 + halfCountL;
        int B = halfCountR +              halfCountL + countL % 2;

        result = result.replace("A", A + " ");
        return result.replace("B", B + " ");
    }

}