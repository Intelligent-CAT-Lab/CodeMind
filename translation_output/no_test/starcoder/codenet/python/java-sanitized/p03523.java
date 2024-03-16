import java.util.*;
public class p03523 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean b=s.replace("A","")=="KIHBR";
        if(b){
            List<String> L=Arrays.asList(s.split("A"));
            List<Integer> X=Arrays.asList(1,0,0,1,1,1,1);
            b&=L.stream().map(s->s.length()).allMatch(i->i<=X.get(i));
        }
        System.out.println("YNEOS"[b?0:1]);
    }
}