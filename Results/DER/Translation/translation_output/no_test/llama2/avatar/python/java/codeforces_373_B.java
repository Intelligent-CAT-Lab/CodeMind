<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
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
    main ( sys . stdin . readlines ( ) )


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, m, k;
        w = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());
        k = Integer.parseInt(sc.nextLine());
        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = m.length();
            int sameCostUntil = (int) Math.pow(10, currentCostPerN);
            int usableNumbers = sameCostUntil - m;
            int useDigits = usableNumbers * currentCostPerN;
            m = sameCostUntil;
            if (availableDigits >= useDigits) {
                maxLength += usableNumbers;
                availableDigits -= useDigits;
            } else {
                maxLength += availableDigits / currentCostPerN;
                availableDigits = 0;
            }
        }
        System.out.println(maxLength);
    }
}
```

### 解析

```python
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
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
    main ( sys . stdin . readlines ( ) )


```

### 解析

```python
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
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
    main ( sys . stdin . readlines ( ) )


```

### 解析

```python
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
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
    main ( sys . stdin . readlines ( ) )


```

### 解析

```python
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
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
    main ( sys . stdin . readlines ( ) )


```

### 解析

```python
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
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
    main ( sys . stdin . readlines ( ) )


```

### 解析

```python
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
    max_length = 0
    available_digits = int ( w / k )
    while available_digits > 0 :
        current_cost_per_n = len ( str ( m ) )
        same_cost_until = 10 ** ( current_cost_per_n )
        usable_numbers = same_cost_until - m
        use_digits = usable_
