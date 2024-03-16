import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sa = s.split("\\.");
        int sl = sa.length;
        String ca = "01+-*()";
        int r = -1;
        HashMap<String, Integer> fm = new HashMap<String, Integer>();
        for(int i = 0; i < sl-1; i++) {
            String t = "";
            for(int j = 0; j < sl; j++) {
                t += sa[j];
                if(j < sl-1) {
                    t += ca.charAt(i);
                }
            }
            int tr = _f(t);
            if(tr != -1) {
                tr = Integer.parseInt(tr, 2);
                if(tr >= 1024 || tr < 0) {
                    tr = -1;
                }
            }
            if(r < tr) {
                r = tr;
            }
        }
        System.out.println(r);
    }
    public static int _f(String s) {
        if(s.indexOf(')') != -1) {
            int ri = s.indexOf(')');
            if(s.length() > ri+1 && s.charAt(ri+1) == '0' || s.charAt(ri+1) == '1') {
                return -1;
            }
            int li = -1;
            for(int i = ri-1; i >= 0; i--) {
                if(s.charAt(i) == '(') {
                    li = i;
                    break;
                }
            }
            if(li < 0 || li > 0 && s.charAt(li-1) == '0' || s.charAt(li-1) == '1') {
                return -1;
            }
            String ts = s.substring(li+1, ri);
            if(ts.indexOf('+') == -1 && ts.indexOf('-') == -1 && ts.indexOf('*') == -1) {
                return -1;
            }
            int tr = _f(ts);
            if(tr == -1) {
                return -1;
            }
            return _f(s.substring(0, li) + tr + s.substring(ri+1));
        }
        if(s.indexOf('(') != -1) {
            return -1;
        }
        int