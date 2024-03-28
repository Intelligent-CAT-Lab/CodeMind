<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'A') {
                output += "00000";
            } else if (c == 'B') {
                output += "00001";
            } else if (c == 'C') {
                output += "00010";
            } else if (c == 'D') {
                output += "00011";
            } else if (c == 'E') {
                output += "00100";
            } else if (c == 'F') {
                output += "00101";
            } else if (c == 'G') {
                output += "00110";
            } else if (c == 'H') {
                output += "00111";
            } else if (c == 'I') {
                output += "01000";
            } else if (c == 'J') {
                output += "01001";
            } else if (c == 'K') {
                output += "01010";
            } else if (c == 'L') {
                output += "01011";
            } else if (c == 'M') {
                output += "01100";
            } else if (c == 'N') {
                output += "01101";
            } else if (c == 'O') {
                output += "01110";
            } else if (c == 'P') {
                output += "01111";
            } else if (c == 'Q') {
                output += "10000";
            } else if (c == 'R') {
                output += "10001";
            } else if (c == 'S') {
                output += "10010";
            } else if (c == 'T') {
                output += "10011";
            } else if (c == 'U') {
                output += "10100";
            } else if (c == 'V') {
                output += "10101";
            } else if (c == 'W') {
                output += "10110";
            } else if (c == 'X') {
                output += "10111";
            } else if (c == 'Y') {
                output += "11000";
            } else if (c == 'Z') {
                output += "11001";
            } else if (c == ' ') {
                output += "11010";
            } else if (c == '.') {
                output += "11011";
            } else if (c == ',') {
                output += "11100";
            } else if (c == '-') {
                output += "11101";
            } else if (c == '\'') {
                output += "11110";
            } else if (c == '?') {
                output += "11111";
            }
        }
        System.out.println(output);
    }
}
```
This code takes a string as input and converts it to Morse code using the mapping provided in the Python code. It then prints the resulting Morse code string.

Note that this code assumes that the input string only contains uppercase letters, spaces, periods, commas, and question marks. If the input string contains any other characters, the code will not work correctly.</s>
