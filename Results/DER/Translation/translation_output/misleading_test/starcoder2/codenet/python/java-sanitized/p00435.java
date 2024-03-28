import java.util.*;
public class p00435 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        String list="";
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)=='C'){
                list=list+"Z";
            }
            else if(w.charAt(i)=='B'){
                list=list+"Y";
            }
            else if(w.charAt(i)=='A'){
                list=list+"X";
            }
            else{
                char c=(char)(w.charAt(i)-3);
                list=list+c;
            }
        }
        System.out.println(list);
    }
}