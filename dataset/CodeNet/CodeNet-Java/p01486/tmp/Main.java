import java.util.*;
import java.lang.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String S = sc.next();
System.out.println("[INST]6;S;sc.next();"+S);
                if (saiki(S)) {
                        System.out.println("Cat");
                } else {
                        System.out.println("Rabbit");
                }
        }

        public static boolean saiki(String S){
                if (S.equals("")) {
System.out.println("[INST]15;None;S.equals('');"+S.equals(""));
                        return true;
                }
                if (S.charAt(0) != 'm') {
System.out.println("[INST]18;None;S.charAt(0);"+S.charAt(0));
                        return false;
                }
                int en = 1;
                int i;
                for (i = 1; i < S.length() && en != 0; i++) {
System.out.println("[INST]23;None;S.length();"+S.length());
                        if (S.charAt(i) == 'm') {
System.out.println("[INST]24;None;S.charAt(i);"+S.charAt(i));
                                en++;
                        } else if(S.charAt(i) == 'e'){
System.out.println("[INST]26;None;S.charAt(i);"+S.charAt(i));
                                en--;
                        }
                }
                if (i == S.length()) {
System.out.println("[INST]30;None;S.length();"+S.length());
                        return false;
                }
                int eindex = i;
                int mn = 1;
                i++;
                for (; i < S.length() && mn != 0; i++) {
System.out.println("[INST]36;None;S.length();"+S.length());
                        if (S.charAt(i) == 'e') {
System.out.println("[INST]37;None;S.charAt(i);"+S.charAt(i));
                                mn++;
                        } else if(S.charAt(i) == 'w'){
System.out.println("[INST]39;None;S.charAt(i);"+S.charAt(i));
                                mn--;
                        }
                }
                if (i != S.length()) {
System.out.println("[INST]43;None;S.length();"+S.length());
                        return false;
                }
                return saiki(S.substring(1, eindex - 1)) && saiki(S.substring(eindex, S.length() - 1));
System.out.println("[INST]46;None;S.substring(1, eindex - 1);"+S.substring(1, eindex - 1));
System.out.println("[INST]46;None;S.substring(eindex, S.length() - 1);"+S.substring(eindex, S.length() - 1));
System.out.println("[INST]46;None;S.length();"+S.length());
        }
}