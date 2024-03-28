<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
?D-C'KOPUA

Expected output:
PETER POTTER


```
def main():
    tableA,tableB = make_table()
    while True:
        try:
            s = "".join(map(lambda c: tableA[c],raw_input()))
        except:
            break
        tmp,ans = "",""
        for c in s:
            tmp += c
            if tmp in tableB:
                ans += tableB[tmp]
                tmp = ""
        print ans
    
def make_table():
    tableA={
        "A":"00000",
        "B":"00001",
        "C":"00010",
        "D":"00011",
        "E":"00100",
        "F":"00101",
        "G":"00110",
        "H":"00111",
        "I":"01000",
        "J":"01001",
        "K":"01010",
        "L":"01011",
        "M":"01100",
        "N":"01101",
        "O":"01110",
        "P":"01111",
        "Q":"10000",
        "R":"10001",
        "S":"10010",
        "T":"10011",
        "U":"10100",
        "V":"10101",
        "W":"10110",
        "X":"10111", 
        "Y":"11000",
        "Z":"11001",
        " ":"11010",
        ".":"11011",
        ",":"11100",
        "-":"11101",
        "'":"11110",
        "?":"11111"}
    tableB ={
        "101":" ",
        "000000":"'",
        "000011":",",
        "10010001":"-",
        "010001":".",
        "000001":"?",
        "100101":"A",
        "10011010":"B",
        "0101":"C",
        "0001":"D",
        "110":"E",
        "01001":"F",
        "10011011":"G",
        "010000":"H",
        "0111":"I",
        "10011000":"J",
        "0110":"K",
        "00100":"L",
        "10011001":"M",
        "10011110":"N",
        "00101":"O",
        "111":"P",
        "10011111":"Q",
        "1000":"R",
        "00110":"S",
        "00111":"T",
        "10011100":"U",
        "10011101":"V",
        "000010":"W",
        "10010010":"X",
        "10010011":"Y",
        "10010000":"Z"}
    return tableA,tableB

if __name__ == "__main__":
    main()
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] tableA = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] tableB = {" ","?",".","-","'","101","110","111","10010001","10010010","10010011","100101","10011000","10011001","10011010","10011011","10011100","10011101","10011110","10011111","1000","10000","10001","101","110","111","000000","000001","000010","000011","0001","00100","00101","00110","00111","01000","010000","010001","01001","0101","0110","0111","10000","10001","10010000","10010001","10010010","10010011","100101","10011000","10011001","10011010","10011011","10011100","10011101","10011110","10011111","10100","10101","10110","10111","11000","11001","11010","11011","11100","11101","11110","11111"};
        String[] tableC = new String[256];
        for(int i=0;i<tableA.length;i++){
            tableC[tableA[i].charAt(0)] = tableB[i];
        }
        String ans = "";
        for(int i=0;i<s.length();i++){
            ans += tableC[s.charAt(i)];
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
