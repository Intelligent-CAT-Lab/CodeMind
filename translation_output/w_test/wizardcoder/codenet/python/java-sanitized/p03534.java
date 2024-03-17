import java.util.*;

public class p03534 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int a=map.get('a');
        int b=map.get('b');
        int c=map.get('c');
        if(Math.max(Math.abs(a-b),Math.abs(b-c),Math.abs(c-a))<=1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}