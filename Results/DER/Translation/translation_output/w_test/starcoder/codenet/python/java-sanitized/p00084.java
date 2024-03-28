import java.util.*;
public class p00084 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String code = in.nextLine();
        code = code.replace(",","");
        code = code.replace(".","");
        String[] codeArray = code.split(" ");
        List<String> list = new ArrayList<String>();
        for(String var : codeArray){
            if(var.length() >= 3 && var.length() <= 6){
                list.add(var);
            }
        }
        for(String var : list){
            System.out.print(var + " ");
        }
    }
}