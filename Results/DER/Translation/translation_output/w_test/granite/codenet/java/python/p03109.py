System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
Heisei


```
import java.util.Scanner;
class p03109{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
        if(time.charAt(0)=='1'||Character.getNumericValue(time.charAt(1))>4) {
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}

```


Answer:
```python
import datetime

def main():
    input_date = input("Enter a date in the format YYYY/MM/DD: ")
    date = datetime.datetime.strptime(input_date, "%Y/%m/%d")
    if date.year >= 2019:
        print("Heisei")
    else:
        print("TBD")

if __name__ == "__main__":
    main()
```

Test input:
2019/04/30

Expected output:
Heisei<|endoftext|>
