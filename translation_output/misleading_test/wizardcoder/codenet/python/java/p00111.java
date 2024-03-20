Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
public class Main {
    public static void main(String[] args) {
        char[][] tableA = makeTableA();
        char[][] tableB = makeTableB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String s = scanner.nextLine();
                String ans = translate(s, tableA, tableB);
                System.out.println(ans);
            } catch (Exception e) {
                break;
            }
        }
    }

    private static char[][] makeTableA() {
        char[][] tableA = new char[2][16];
        tableA[0][0] = '0';
        tableA[0][1] = '0';
        tableA[0][2] = '0';
        tableA[0][3] = '0';
        tableA[0][4] = '0';
        tableA[0][5] = '0';
        tableA[0][6] = '0';
        tableA[0][7] = '0';
        tableA[0][8] = '0';
        tableA[0][9] = '0';
        tableA[0][10] = '0';
        tableA[0][11] = '0';
        tableA[0][12] = '0';
        tableA[0][13] = '0';
        tableA[0][14] = '0';
        tableA[0][15] = '0';
        tableA[1][0] = '0';
        tableA[1][1] = '0';
        tableA[1][2] = '0';
        tableA[1][3] = '0';
        tableA[1][4] = '0';
        tableA[1][5] = '0';
        tableA[1][6] = '0';
        tableA[1][7] = '0';
        tableA[1][8] = '0';
        tableA[1][9] = '0';
        tableA[1][10] = '0';
        tableA[1][11] = '0';
        tableA[1][12] = '0';
        tableA[1][13] = '0';
        tableA[1][14] = '0';
        tableA[1][15] = '0';
        tableA['A'] = "00000";
        tableA['B'] = "00001";
        tableA['C'] = "00010";
        tableA['D'] = "00011";
        tableA['E'] = "00100";
        tableA['F'] = "00101";
        tableA['G'] = "00110";
        tableA['H'] = "00111";
        tableA['I'] = "01000";
        tableA['J'] = "01001";
        tableA['K'] = "01010";
        tableA['L'] = "01011";
        tableA['M'] = "01100";
        tableA['N'] = "01101";
        tableA['O'] = "01110";
        tableA['P'] = "01111";
        tableA['Q'] = "10000";
        tableA['R'] = "10001";
        tableA['S'] = "10010";
        tableA['T'] = "10011";
        tableA['U'] = "10100";
        tableA['V'] = "10101";
        tableA['W'] = "10110";
        tableA['X'] = "10111";
        tableA['Y'] = "11000";
        tableA['Z'] = "11001";
        tableA[' '] = "11010";
        tableA['.'] = "11011";
        tableA[','] = "11100";
        tableA['-'] = "11101";
        tableA['\''] = "11110";
        tableA['?'] = "11111";
        return tableA;
    }

    private static char[][] makeTableB() {
        char[][] tableB = new char[2][16];
        tableB[0][0] = '0';
        tableB[0][1] = '0';
        tableB[0][2] = '0';
        tableB[0][3] = '0';
        tableB[0][4] = '0';
        tableB[0][5] = '0';
        tableB[0][6] = '0';
        tableB[0][7] = '0';
        tableB[0][8] = '0';
        tableB[0][9] = '0';
        tableB[0][10] = '0';
        tableB[0][11] = '0';
        tableB[0][12] = '0';
        tableB[0][13] = '0';
