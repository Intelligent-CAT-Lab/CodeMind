System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tableA = {"00000", "00001", "00010", "00011", "00100", "00101", "00110", "00111", "01000", "01001", "01010", "01011", "01100", "01101", "01110", "01111", "10000", "10001", "10010", "10011", "10100", "10101", "10110", "10111", "11000", "11001", "11010", "11011", "11100", "11101", "11110", "11111"};
        String[] tableB = {"101", "000000", "000011", "10010001", "010001", "000001", "100101", "10011010", "0101", "00001", "110", "01001", "10011011", "010000", "0111", "10011110", "10011111", "1000", "00110", "00111", "10011100", "10011101", "000010", "10010010", "10010011", "10010000"};
        String input;
        while (true) {
            try {
                input = scanner.nextLine();
            } catch (Exception e) {
                break;
            }
            String tmp = "";
            StringBuilder ans = new StringBuilder();
            for (char c : input.toCharArray()) {
                tmp += c;
                if (tmp.length() == 5) {
                    for (int i = 0; i < tableB.length; i++) {
                        if (tmp.equals(tableB[i])) {
                            ans.append(tableA[i]);
                            tmp = "";
                            break;
                        }
                    }
                }
            }
            System.out.println(ans.toString());
        }
    }
}
```

This Java code reads input from the user using a Scanner, and then encodes the input using the provided tables. It uses a StringBuilder to build the output string, and checks if the current substring matches any of the entries in the tableB. If a match is found, it appends the corresponding entry from tableA to the output string, and resets the temporary substring. Finally, it prints the output string.<|endoftext|>
