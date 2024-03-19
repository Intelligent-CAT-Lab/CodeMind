<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
?D-C'KOPUA

Expected output:
34TSR POTTE

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

### Response:
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, String> tableA = makeTableA();
        Map<String, Character> tableB = makeTableB();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            StringBuilder encoded = new StringBuilder();
            for (char c : s.toCharArray()) {
                encoded.append(tableA.get(c));
            }
            StringBuilder decoded = new StringBuilder();
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < encoded.length(); i++) {
                tmp.append(encoded.charAt(i));
                if (tableB.containsKey(tmp.toString())) {
                    decoded.append(tableB.get(tmp.toString()));
                    tmp = new StringBuilder();
                }
            }
            System.out.println(decoded.toString());
        }
    }

    private static Map<Character, String> makeTableA() {
        Map<Character, String> tableA = new HashMap<>();
        tableA.put('A', "00000");
        tableA.put('B', "00001");
        tableA.put('C', "00010");
        tableA.put('D', "00011");
        tableA.put('E', "00100");
        tableA.put('F', "00101");
        tableA.put('G', "00110");
        tableA.put('H', "00111");
        tableA.put('I', "01000");
        tableA.put('J', "01001");
        tableA.put('K', "01010");
        tableA.put('L', "01011");
        tableA.put('M', "01100");
        tableA.put('N', "01101");
        tableA.put('O', "01110");
        tableA.put('P', "01111");
        tableA.put('Q', "10000");
        tableA.put('R', "10001");
        tableA.put('S', "10010");
        tableA.put('T', "10011");
        tableA.put('U', "10100");
        tableA.put('V', "10101");
        tableA.put('W', "10110");
        tableA.put('X', "10111");
        tableA.put('Y', "11000");
        tableA.put('Z', "11001");
        tableA.put(' ', "11010");
        tableA.put('.', "11011");
        tableA.put(',', "11100");
        tableA.put('-', "11101");
        tableA.put('\'', "11110");
        tableA.put('?', "11111");
        return tableA;
    }

    private static Map<String, Character> makeTableB() {
        Map<String, Character> tableB = new HashMap<>();
        tableB.put("101", ' ');
        tableB.put("000000", '\'');
        tableB.put("000011", ',');
        tableB.put("10010001", '-');
        tableB.put("010001", '.');
        tableB.put("000001", '?');
        tableB.put("100101", 'A');
        tableB.put("10011010", 'B');
        tableB.put("0101", 'C');
        tableB.put("0001", 'D');
        tableB.put("110", 'E');
        tableB.put("010000", 'H');
        tableB.put("0111", 'I');
        tableB.put("100
