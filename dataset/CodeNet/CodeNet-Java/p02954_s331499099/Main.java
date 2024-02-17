import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        ArrayList<String> Sa = new ArrayList<String>();

        int prev = 0;
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i) == 'R' && S.charAt(i+1) == 'L'){
                for(int j=i+1;j<S.length();j++){
                    if(S.charAt(j) == 'R'){
                        String str = S.substring(prev,j);
                        Sa.add(str);
                        prev = j;
                        break;
                    }else if(j == S.length()-1){
                        String str = S.substring(prev,S.length());
                        Sa.add(str);
                        prev = i+j;                        
                        break;
                    }
                }
            }
        }

        for(int i=0;i<Sa.size();i++){
            String str = Sa.get(i);
            int len = str.length();
            int index = str.indexOf("RL");

            boolean flag = false;
            if((str.substring(0,index).length())%2==1 && (str.substring(index+1,str.length()-1).length())%2==0)
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
