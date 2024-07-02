import java.util.*;

class Main{
    int val(char ch){ return ch-'0';}

    int sub(String maxs, String mins){
        for ( int i = 0; i < maxs.length(); i++ ){
System.out.println("[INST]6;None;maxs.length();"+maxs.length());
            if ( maxs.charAt(i) != mins.charAt(i) ) {
System.out.println("[INST]7;None;maxs.charAt(i);"+maxs.charAt(i));
System.out.println("[INST]7;None;mins.charAt(i);"+mins.charAt(i));
                if ( i == maxs.length()-1 )
System.out.println("[INST]8;None;maxs.length();"+maxs.length());
                    return val(maxs.charAt(i)) - val(mins.charAt(i));
System.out.println("[INST]9;None;maxs.charAt(i);"+maxs.charAt(i));
System.out.println("[INST]9;None;mins.charAt(i);"+mins.charAt(i));
                if ( i == maxs.length()-2 )
System.out.println("[INST]10;None;maxs.length();"+maxs.length());
                    return (10*val(maxs.charAt(i))+val(maxs.charAt(i+1))) - (10*val(mins.charAt(i))+val(mins.charAt(i+1)));
System.out.println("[INST]11;None;maxs.charAt(i);"+maxs.charAt(i));
System.out.println("[INST]11;None;maxs.charAt(i+1);"+maxs.charAt(i+1));
System.out.println("[INST]11;None;mins.charAt(i);"+mins.charAt(i));
System.out.println("[INST]11;None;mins.charAt(i+1);"+mins.charAt(i+1));
                return 10;
            }
        }
        return 0;
    }

  int checkEqual(String S){
        String mins, maxs;
        int ans = 8;
        for ( int k = 1; k < S.length(); k++ ){
System.out.println("[INST]21;None;S.length();"+S.length());
            if ( S.length()%k != 0 ) continue;
System.out.println("[INST]22;None;S.length();"+S.length());
            mins = maxs = S.substring(0, k);
System.out.println("[INST]23;maxs;S.substring(0, k);"+maxs);
            for ( int s = 0; s < S.length(); s += k ){
System.out.println("[INST]24;None;S.length();"+S.length());
                String tmp = S.substring(s, s + k);
System.out.println("[INST]25;tmp;S.substring(s, s + k);"+tmp);
                if ( tmp.compareTo(maxs) > 0 ) maxs = tmp;
System.out.println("[INST]26;None;tmp.compareTo(maxs);"+tmp.compareTo(maxs));
                if ( tmp.compareTo(mins) < 0 ) mins = tmp;
System.out.println("[INST]27;None;tmp.compareTo(mins);"+tmp.compareTo(mins));
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        return ans;
    }

    int check12(String S){
        int maxv = 0;
        int minv = 10;
        for( int p = 0; p < S.length(); p++){
System.out.println("[INST]37;None;S.length();"+S.length());
            int v = val(S.charAt(p));
System.out.println("[INST]38;None;S.charAt(p);"+S.charAt(p));
            if ( S.charAt(p) == '1' && p+1 < S.length()) {
System.out.println("[INST]39;None;S.charAt(p);"+S.charAt(p));
System.out.println("[INST]39;None;S.length();"+S.length());
                v = 10 + val(S.charAt(p+1));
System.out.println("[INST]40;None;S.charAt(p+1);"+S.charAt(p+1));
                p++;
            }
            maxv = Math.max(maxv, v);
System.out.println("[INST]43;maxv;Math.max(maxv, v);"+maxv);
            minv = Math.min(minv, v);
System.out.println("[INST]44;minv;Math.min(minv, v);"+minv);
        }
        return maxv - minv;
    }

    void solve(){
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
System.out.println("[INST]52;S;sc.next();"+S);
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}


