import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class codeforces_8_B {
    
    public static void main(String[] args) {
        String path = "LUUDU";
        System.out.println(checkPath(path)); // Running the example test case
    }
    
    public static String checkPath(String path) {
        Set<String> coord = new HashSet<>();
        String temp = "0,0";
        coord.add(temp);
        
        for(char c : path.toCharArray()) {
            String[] parts = temp.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            
            switch(c) {
                case 'L':
                    temp = (x + "," + (y - 1));
                    break;
                case 'R':
                    temp = (x + "," + (y + 1));
                    break;
                case 'U':
                    temp = ((x - 1) + "," + y);
                    break;
                case 'D':
                    temp = ((x + 1) + "," + y);
                    break;
                default:
                    break;
            }
            if(coord.contains(temp)) {
                return "BUG";
            }
            coord.add(temp);
        }
        coord.remove("0,0");
        
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        
        while(!que.isEmpty()) {
            if(que.size() > 1) {
                return "BUG";
            }
            String current = que.poll();
            String[] parts = current.split(",");
            int i = Integer.parseInt(parts[0]);
            int j = Integer.parseInt(parts[1]);
            
            for(int[] direction : new int[][]{{i+1, j}, {i-1, j}, {i, j+1}, {i, j-1}}) {
                String p = direction[0] + "," + direction[1];
                if(coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                }
            }
        }

        return "OK";
    }
}