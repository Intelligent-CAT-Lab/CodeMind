<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def main ( lines ) :
    w, m, k = list ( map ( int, lines [ 0 ]. split ( ) ) )
    max_length = 0
    available_digits = int ( w / k )
    while available_digits > 0 :
        current_cost_per_n = len ( str ( m ) )
        same_cost_until = 10 ** ( current_cost_per_n )
        usable_numbers = same_cost_until - m
        use_digits = usable_numbers * current_cost_per_n
        m = same_cost_until
        if available_digits >= use_digits :
            max_length += usable_numbers
            available_digits -= use_digits
        else :
            max_length += int ( available_digits / current_cost_per_n )
            available_digits = 0
    print ( max_length )
if __name__ == " _ _ main _ _ " :
    main ( sys. stdin. readlines ( ) )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int max_length = 0;
        int available_digits = w / k;
        while (available_digits > 0) {
            int current_cost_per_n = (int) Math.log10(m) + 1;
            int same_cost_until = (int) Math.pow(10, current_cost_per_n);
            int usable_numbers = same_cost_until - m;
            int use_digits = usable_numbers * current_cost_per_n;
            m = same_cost_until;
            if (available_digits >= use_digits) {
                max_length += usable_numbers;
                available_digits -= use_digits;
            } else {
                max_length += available_digits / current_cost_per_n;
                available_digits = 0;
            }
        }
        System.out.println(max_length);
    }
}
```
<|endoftext|>
