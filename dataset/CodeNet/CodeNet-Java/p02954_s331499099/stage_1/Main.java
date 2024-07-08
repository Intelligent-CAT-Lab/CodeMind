import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        ArrayList<String> Sa = new ArrayList<String>();

        int prev = 0;
var newVariable_0 = S.length();        for(int i=0;i<newVariable_0-1;i++){
var newVariable_1 = S.charAt(i);var newVariable_2 = S.charAt(i+1);            if(S.charAt(i) == 'R' && newVariable_2 == 'L'){
var newVariable_3 = S.length();                for(int j=i+1;j<newVariable_3;j++){
var newVariable_4 = S.charAt(j);                    if(newVariable_4 == 'R'){
                        String str = S.substring(prev,j);
var newVariable_5 = Sa.add(str);                        prev = j;
                        break;
var newVariable_6 = S.length();                    }else if(j == newVariable_6-1){
var newVariable_7 = S.length();                        String str = S.substring(prev,newVariable_7);
var newVariable_8 = Sa.add(str);                        prev = i+j;                        
                        break;
                    }
                }
            }
        }

var newVariable_9 = Sa.size();        for(int i=0;i<newVariable_9;i++){
            String str = Sa.get(i);
            int len = str.length();
            int index = str.indexOf("RL");

            boolean flag = false;
var newVariable_10 = str.substring(0,index).length();var newVariable_11 = str.substring(0,index);var newVariable_12 = str.substring(index+1,str.length()-1).length();var newVariable_13 = str.substring(index+1,str.length()-1);var newVariable_14 = str.length();            if((str.substring(0,index).length())%2==1 && (str.substring(index+1,newVariable_14-1).length())%2==0)
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
