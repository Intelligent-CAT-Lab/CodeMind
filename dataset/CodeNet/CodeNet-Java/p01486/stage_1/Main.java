import java.util.*;
import java.lang.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String S = sc.next();
                if (saiki(S)) {
                        System.out.println("Cat");
                } else {
                        System.out.println("Rabbit");
                }
        }

        public static boolean saiki(String S){
var newVariable_0 = S.equals("");                if (newVariable_0) {
                        return true;
                }
var newVariable_1 = S.charAt(0);                if (newVariable_1 != 'm') {
                        return false;
                }
                int en = 1;
                int i;
var newVariable_2 = S.length();                for (i = 1; i < newVariable_2 && en != 0; i++) {
var newVariable_3 = S.charAt(i);                        if (newVariable_3 == 'm') {
                                en++;
var newVariable_4 = S.charAt(i);                        } else if(newVariable_4 == 'e'){
                                en--;
                        }
                }
var newVariable_5 = S.length();                if (i == newVariable_5) {
                        return false;
                }
                int eindex = i;
                int mn = 1;
                i++;
var newVariable_6 = S.length();                for (; i < newVariable_6 && mn != 0; i++) {
var newVariable_7 = S.charAt(i);                        if (newVariable_7 == 'e') {
                                mn++;
var newVariable_8 = S.charAt(i);                        } else if(newVariable_8 == 'w'){
                                mn--;
                        }
                }
var newVariable_9 = S.length();                if (i != newVariable_9) {
                        return false;
                }
var newVariable_10 = S.substring(1, eindex - 1);var newVariable_11 = S.substring(eindex, S.length() - 1);var newVariable_12 = S.length();                return saiki(S.substring(1, eindex - 1)) && saiki(S.substring(eindex, newVariable_12 - 1));
        }
}