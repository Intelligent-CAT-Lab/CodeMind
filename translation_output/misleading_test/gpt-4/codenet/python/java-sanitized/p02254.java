import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        HashMap<Character, Integer> dictString = new HashMap<>();
        HashMap<Character, Integer> dictDepth = new HashMap<>();
        
        for(char s : S.toCharArray()) {
            dictString.put(s, dictString.getOrDefault(s, 0) + 1);
            dictDepth.putIfAbsent(s, 0);
        }
        
        HashMap<String, Integer> dictStringCalc = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : dictString.entrySet()) {
            dictStringCalc.put(Character.toString(entry.getKey()), entry.getValue());
        }
        
        while (dictStringCalc.size() != 1) {
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(dictStringCalc.entrySet());
            entryList.sort(Map.Entry.comparingByValue());
            
            String x = null, y = null;
            int xCnt = 0, yCnt = 0;
            
            for(Map.Entry<String, Integer> entry : entryList) {
                if(x == null) {
                    x = entry.getKey();
                    xCnt = entry.getValue();
                    continue;
                }
                
                if(y == null) {
                    y = entry.getKey();
                    yCnt = entry.getValue();
                    break;
                }
            }
            
            for (char s : (x + y).toCharArray()) {
                dictDepth.put(s, dictDepth.getOrDefault(s, 0) + 1);
            }
            
            dictStringCalc.remove(x);
            dictStringCalc.remove(y);
            dictStringCalc.put(x + y, xCnt + yCnt);
        }
        
        int ans = 0;
        
        for(Map.Entry<Character, Integer> entry : dictDepth.entrySet()) {
            ans += dictString.get(entry.getKey()) * entry.getValue();
        }
        
        if (dictString.size() == 1) {
            ans = S.length();
        }
        
        System.out.println(ans);
        sc.close();
    }
}