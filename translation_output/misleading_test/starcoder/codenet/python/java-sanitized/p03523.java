import java.util.*;
public class p03523 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        boolean b=S.replace("A","")=="KIHBR";
        if(b){
            List<Integer> L=Arrays.asList(S.split("A")).stream().map(s->s.length()).collect(Collectors.toList());
            List<Integer> X=Arrays.asList(1,0,0,1,1,1,1);
            b&=L.stream().allMatch(i->i<=X.get(i));
        }
        System.out.println("YNEOS"[b?0:1]);
    }
}