import java.util.*;
public class p01531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        String answer = "";
        for(int i=0;i<moji.length();i++){
            if(moji.charAt(i)=='2'){
                answer+="k";
            }
            else if(moji.charAt(i)=='3'){
                answer+="s";
            }
            else if(moji.charAt(i)=='4'){
                answer+="t";
            }
            else if(moji.charAt(i)=='5'){
                answer+="n";
            }
            else if(moji.charAt(i)=='6'){
                answer+="h";
            }
            else if(moji.charAt(i)=='7'){
                answer+="m";
            }
            else if(moji.charAt(i)=='8'){
                answer+="y";
            }
            else if(moji.charAt(i)=='9'){
                answer+="r";
            }
            else if(moji.charAt(i)=='0'){
                i++;
                if(moji.charAt(i)=='T'){
                    answer+="wa";
                }
                else if(moji.charAt(i)=='D'){
                    answer+="wo";
                }
                else if(moji.charAt(i)=='U'){
                    answer+="nn";
                }
            }
            else if(moji.charAt(i)=='T'){
                answer+="a";
            }
            else if(moji.charAt(i)=='L'){
                answer+="i";
            }
            else if(moji.charAt(i)=='U'){
                answer+="u";
            }
            else if(moji.charAt(i)=='R'){
                answer+="e";
            }
            else if(moji.charAt(i)=='D'){
                answer+="o";
            }
        }
        System.out.println(answer);
    }
}