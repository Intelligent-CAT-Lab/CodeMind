
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
System.out.println("[INST]7;s;sc.nextLine();"+s);

        StringBuilder result = new StringBuilder();

        while (s.contains("LR")) {
System.out.println("[INST]11;None;s.contains('LR');"+s.contains("LR"));
            
            int indexLR = s.indexOf("LR");
System.out.println("[INST]13;indexLR;s.indexOf('LR');"+indexLR);
            int lastIndexOfFirstRLBlock;
            if(indexLR ==1){
                lastIndexOfFirstRLBlock = 1;
            }else {
                lastIndexOfFirstRLBlock = indexLR;
            }
            
            String firstRLBlock = s.substring(0, lastIndexOfFirstRLBlock + 1);
System.out.println("[INST]21;firstRLBlock;s.substring(0, lastIndexOfFirstRLBlock + 1);"+firstRLBlock);
            s = s.substring(lastIndexOfFirstRLBlock + 1);
System.out.println("[INST]22;s;s.substring(lastIndexOfFirstRLBlock + 1);"+s);
            result.append(makeSubResult(firstRLBlock));
        }
        result.append(makeSubResult(s));

        System.out.println(result.toString());
    }

    private static String makeSubResult(String rlBlock) {
        int lastIndexOfR = rlBlock.lastIndexOf("R");
System.out.println("[INST]31;lastIndexOfR;rlBlock.lastIndexOf('R');"+lastIndexOfR);
        int countR = lastIndexOfR + 1;
        int countL = rlBlock.length() - countR;
System.out.println("[INST]33;None;rlBlock.length();"+rlBlock.length());

        String result = rlBlock.replace("RL", "AB");
System.out.println("[INST]35;result;rlBlock.replace('RL', 'AB');"+result);
        result = result.replace("R", "0 ");
System.out.println("[INST]36;result;result.replace('R', '0 ');"+result);
        result = result.replace("L", "0 ");
System.out.println("[INST]37;result;result.replace('L', '0 ');"+result);

        int halfCountR = countR / 2;
        int halfCountL = countL / 2;

        int A = halfCountR + countR % 2 + halfCountL;
        int B = halfCountR +              halfCountL + countL % 2;

        result = result.replace("A", A + " ");
System.out.println("[INST]45;result;result.replace('A', A + ' ');"+result);
        return result.replace("B", B + " ");
System.out.println("[INST]46;None;result.replace('B', B + ' ');"+result.replace("B", B + " "));
    }

}