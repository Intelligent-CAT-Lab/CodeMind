import java.util.*;
public class p02722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k-1);
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0){
                setl.add(i);
                setl.add(k/i);
            }
        }
        if(setl.contains(1)){
            setl.remove(1);
        }
        System.out.println(setl.size());
    }
}