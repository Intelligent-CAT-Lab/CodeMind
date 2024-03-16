# String[]Ã®ÅÆÅÃÆ´Æ°Ã®ÅÃlongÃ«ÃªÃ£Ã¦ÃÃÃ
# é¢Æ°Ï¼splitÃ¨ÃcontainsÃ¨ÃÏ¼Å
Ã§Ã¯"+"Ã¨ÃÃ¯Æ­£È¦È¡¨Ç¾Ã¨ÃªÃÃÃÃ®Ã§"\\+"Ã¨ÃÃ
# é
ÅÃ®Ã³ÃÃ¼Ã¯arr1=arr.clone()
# HashSet<>[]Ã¯ÃÃ®ÃÃ®ÅÆÅÃÃÏ¼Ï¼Ï¼Ï¼
# È² Ã®Æ°Ã®Å²ÃÇ®Ã¯Çµ¶Å¯¾Å¤ÃÅÃÃÃ»ÃÃ«ÅÃÆ¨Ã¦ÃÃÃ
# ex.-1/2=0Ã®Ã§ÃÃÃÅ¤>kÃ¿ÃÃÃªÅ¼Ã Ã¨ÃÃ°ÃÃÃÃÃÃ®Ã§Æ³¨Æ
# ÃÃÅ¤>=kÃ¨ÃÃ¦ÃÅÃÄ¸ÃÃÅ¤ÃÃ¨ÃÃ¹Ã
# toLowerCase()Ã¯Ã¢Ã«ÃÃ¡ÃÃÃÄ»¥Å¤Ã«Å¯¾ÃÃ¦È¡Ã£Ã¦ÃÃ¨Ã©Ã¼Ã«Ã¯ÃªÃÃªÃ

import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;

public class p03437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        long x=sc.nextLong(),y=sc.nextLong();
        if(x%y==0){
            out.println(-1);
        }else {
            out.println(x);
        }
    }
}