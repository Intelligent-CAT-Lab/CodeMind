class main:
    import java.io.*;
    
    public class p00020 {
        public static void main(String[] args) throws Exception{
            BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
            String s,t;
            char c;
            while((s=bf.readLine())!=null){
                t="";
                for(int i=0,j=s.length();i<j;i++){
                    c=s.charAt(i);
                    if(c>=97 and c<=123):
                        t+=(char)(c-32);
                    else:
                        t+=c;
                }
                System.out.println(t);
            }
        }
    }