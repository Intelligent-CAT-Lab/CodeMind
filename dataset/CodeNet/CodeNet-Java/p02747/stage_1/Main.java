import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String ans = "Yes";


var newVariable_0 = S.length();        if(newVariable_0 % 2 == 1){
            ans = "No";
        } else {
var newVariable_1 = S.length();            for(int i=0;i < newVariable_1/2;i+=2){
var newVariable_2 = S.substring(i,i+2).equals("hi");var newVariable_3 = S.substring(i,i+2);                if(!newVariable_3.equals("hi")){
                  ans = "No";
                }
            }
        }
        System.out.println(ans);

    }

}







