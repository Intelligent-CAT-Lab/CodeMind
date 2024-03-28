import java.util.*;
public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        Set<String> coord = new HashSet<String>();
        coord.add("0,0");
        String temp = "0,0";
        for(char c : path.toCharArray()){
            if(c =='L'){
                temp = temp.substring(0,temp.indexOf(',')) + "," + (Integer.parseInt(temp.substring(temp.indexOf(',')+1))-1);
            }else if(c == 'R'){
                temp = temp.substring(0,temp.indexOf(',')) + "," + (Integer.parseInt(temp.substring(temp.indexOf(',')+1))+1);
            }else if(c == 'U'){
                temp = (Integer.parseInt(temp.substring(0,temp.indexOf(',')))-1) + "," + temp.substring(temp.indexOf(',')+1);
            }else{
                temp = (Integer.parseInt(temp.substring(0,temp.indexOf(',')))+1) + "," + temp.substring(temp.indexOf(',')+1);
            }
            if(coord.contains(temp)){
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<String>();
        que.add("0,0");
        while(!que.isEmpty()){
            if(que.size()>1){
                System.out.println("BUG");
                return;
            }
            String[] temp = que.poll().split(",");
            for(int i = 0;i<4;i++){
                int p = Integer.parseInt(temp[0]) + (i==0?1:(i==1?-1:0));
                int q = Integer.parseInt(temp[1]) + (i==2?1:(i==3?-1:0));
                if(coord.contains(p+","+q)){
                    coord.remove(p+","+q);
                    que.add(p+","+q);
                }
            }
        }
        System.out.println("OK");
    }
}