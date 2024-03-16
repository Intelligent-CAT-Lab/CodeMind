<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                    answer [ i ] [ j ] = "1"
            else :
                if j < A :
                    answer [ i ] [ j ] = "1"
                else :
                    answer [ i ] [ j ] = "0"
    for i in range ( H ) :
        print ( ' ' . join ( answer [ i ] ) )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys . stdin :
            for word in line . split ( ) :
                yield word
    tokens = iterate_tokens ( )
    H = int ( next ( tokens ) )
    W = int ( next ( tokens ) )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    solve ( H , W , A , B )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = "0";
                    } else {
                        answer[i][j] = "1";
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = "1";
                    } else {
                        answer[i][j] = "0";
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(String.join(" ", answer[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] tokens = line.split(" ");
            int H = Integer.parseInt(tokens[0]);
            int W = Integer.parseInt(tokens[1]);
            int A = Integer.parseInt(tokens[2]);
            int B = Integer.parseInt(tokens[3]);
            solve(H, W, A, B);
        }
    }
}
```</s>
