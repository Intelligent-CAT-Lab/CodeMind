class main:
    import java.util.*;
    
    public class p01687{
        public static void main(String[] args){
            new p01687().run();
        }
        public void run(){
            Scanner scan = new Scanner(System.in);
            String mstr = "AADINNUY";
            String nstr = "AIZUNYAN";
            char[] t = "AAAAAAAA".toCharArray();
            String tt = "";
            while(scan.hasNext()){
                String dstr = scan.next();
                if(dstr.length() < 8){
                    System.out.println(dstr);
                    continue;
                }
                for(int i = 0;i < dstr.length()-7;i++){
                    t = dstr.substring(i,i+8).toCharArray();
                    tt = String.valueOf(t);
                    Arrays.sort(t);
                    if(mstr.equals(String.valueOf(t))){
                        dstr = dstr.replace(tt,nstr);
                        i += 7;
                    }
                }
                System.out.println(dstr);	
            }
        }
    }