import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
System.out.println("[INST]5;S;sc.next();"+S);
        S = S.replaceAll("eraser", "-");
System.out.println("[INST]6;S;S.replaceAll('eraser', '-');"+S);
        S = S.replaceAll("erase", "-");
System.out.println("[INST]7;S;S.replaceAll('erase', '-');"+S);
        S = S.replaceAll("dreamer", "-");
System.out.println("[INST]8;S;S.replaceAll('dreamer', '-');"+S);
        S = S.replaceAll("dream", "-");
System.out.println("[INST]9;S;S.replaceAll('dream', '-');"+S);
        S = S.replaceAll("-", "");
System.out.println("[INST]10;S;S.replaceAll('-', '');"+S);
        if(S.length() == 0){
System.out.println("[INST]11;None;S.length();"+S.length());
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


        //TLE起こした...
        //後日要検討(DP, 先読みGreedyなど)
//        String[] str = S.split("");
//        int i = 0;
//        boolean flag = false;
//        while(i < str.length){
//            if(S.substring(i).indexOf("dream") == -1 && S.substring(i).indexOf("erase") == -1) {
//                System.out.println("NO");
//                flag = true;
//                break;
//            }else if(S.substring(i, i + 5).equals("dream")){
//                try {
//                    if (str[i + 5].concat(str[i + 6]).equals("er")) {
//                        if(i + 7 < str.length){
//                            if(str[i + 7].equals("a")){
//                                i = i + 5;
//                            }else{
//                                i = i + 7;
//                            }
//                        }else{
//                            i = i + 5;
//                        }
//                    } else {
//                        i = i + 5;
//                    }
//                }catch (ArrayIndexOutOfBoundsException e){
//                    i = i + 5;
//                }
//            }else if(S.substring(i, i + 5).equals("erase")){
//                try {
//                    if (str[i + 5].equals("r")) {
//                        i = i + 6;
//                    } else {
//                        i = i + 5;
//                    }
//                }catch(ArrayIndexOutOfBoundsException e){
//                    i = i + 5;
//                }
//            }
//        }
//        if(!flag){
//            System.out.println("YES");
//        }
    }
}
