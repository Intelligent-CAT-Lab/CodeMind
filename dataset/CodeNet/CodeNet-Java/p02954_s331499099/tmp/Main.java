import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
System.out.println("[INST]7;S;scan.next();"+S);
        ArrayList<String> Sa = new ArrayList<String>();

        int prev = 0;
        for(int i=0;i<S.length()-1;i++){
System.out.println("[INST]11;None;S.length();"+S.length());
            if(S.charAt(i) == 'R' && S.charAt(i+1) == 'L'){
System.out.println("[INST]12;None;S.charAt(i);"+S.charAt(i));
System.out.println("[INST]12;None;S.charAt(i+1);"+S.charAt(i+1));
                for(int j=i+1;j<S.length();j++){
System.out.println("[INST]13;None;S.length();"+S.length());
                    if(S.charAt(j) == 'R'){
System.out.println("[INST]14;None;S.charAt(j);"+S.charAt(j));
                        String str = S.substring(prev,j);
System.out.println("[INST]15;str;S.substring(prev,j);"+str);
                        Sa.add(str);
System.out.println("[INST]16;None;Sa.add(str);"+Sa.add(str));
                        prev = j;
                        break;
                    }else if(j == S.length()-1){
System.out.println("[INST]19;None;S.length();"+S.length());
                        String str = S.substring(prev,S.length());
System.out.println("[INST]20;str;S.substring(prev,S.length());"+str);
System.out.println("[INST]20;None;S.length();"+S.length());
                        Sa.add(str);
System.out.println("[INST]21;None;Sa.add(str);"+Sa.add(str));
                        prev = i+j;                        
                        break;
                    }
                }
            }
        }

        for(int i=0;i<Sa.size();i++){
System.out.println("[INST]29;None;Sa.size();"+Sa.size());
            String str = Sa.get(i);
System.out.println("[INST]30;str;Sa.get(i);"+str);
            int len = str.length();
System.out.println("[INST]31;len;str.length();"+len);
            int index = str.indexOf("RL");
System.out.println("[INST]32;index;str.indexOf('RL');"+index);

            boolean flag = false;
            if((str.substring(0,index).length())%2==1 && (str.substring(index+1,str.length()-1).length())%2==0)
System.out.println("[INST]35;None;str.substring(0,index).length();"+str.substring(0,index).length());
System.out.println("[INST]35;None;str.substring(0,index);"+str.substring(0,index));
System.out.println("[INST]35;None;str.substring(index+1,str.length()-1).length();"+str.substring(index+1,str.length()-1).length());
System.out.println("[INST]35;None;str.substring(index+1,str.length()-1);"+str.substring(index+1,str.length()-1));
System.out.println("[INST]35;None;str.length();"+str.length());
                flag = true;
            else
                flag = false;

            if((len % 2) == 0){
                for(int j=0;j<len;j++){
                    if(j == index || (j == index+1)){
                        System.out.print((len/2) + " ");
                    }else{
                        System.out.print(0 + " ");                        
                    }
                }
            }else{
                for(int j=0;j<len;j++){
                    if(j == index){
                        if(flag)
                            System.out.print((len/2) + " ");
                        else
                            System.out.print((len/2)+1 + " ");
                    }else if(j == index + 1){
                        if(flag)
                            System.out.print((len/2)+1 + " ");
                        else
                            System.out.print((len/2) + " ");
 
                    }else{
                        System.out.print(0 + " ");                        
                    }
                }
            }
        }
    }
}
