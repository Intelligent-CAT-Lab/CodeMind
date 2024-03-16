Below is the translated Python code from the provided Java version. Note that reading from standard input is done differently in Python, but I've mimicked the logic as closely as possible. In Python, input is typically read using the `input()` function.

```python
class MyConv:
    @staticmethod
    def encode(key):
        return {
            ' ':  "101",
            '\'': "000000",
            ',':  "000011",
            '-':  "10010001",
            '.':  "010001",
            '?':  "000001",
            'A':  "100101",
            'B':  "10011010",
            'C':  "0101",
            'D':  "0001",
            'E':  "110",
            'F':  "01001",
            'G':  "10011011",
            'H':  "010000",
            'I':  "0111",
            'J':  "10011000",
            'K':  "0110",
            'L':  "00100",
            'M':  "10011001",
            'N':  "10011110",
            'O':  "00101",
            'P':  "111",
            'Q':  "10011111",
            'R':  "1000",
            'S':  "00110",
            'T':  "00111",
            'U':  "10011100",
            'V':  "10011101",
            'W':  "000010",
            'X':  "10010010",
            'Y':  "10010011",
            'Z':  "10010000",
        }.get(key, "")

    @staticmethod
    def decode(key):
        return {
            "00000": 'A',
            "00001": 'B',
            "00010": 'C',
            "00011": 'D',
            "00100": 'E',
            "00101": 'F',
            "00110": 'G',
            "00111": 'H',
            "01000": 'I',
            "01001": 'J',
            "01010": 'K',
            "01011": 'L',
            "01100": 'M',
            "01101": 'N',
            "01110": 'O',
            "01111": 'P',
            "10000": 'Q',
            "10001": 'R',
            "10010": 'S',
            "10011": 'T',
            "10100": 'U',
            "10101": 'V',
            "10110": 'W',
            "10111": 'X',
            "11000": 'Y',
            "11001": 'Z',
            "11010": ' ',
            "11011": '.',
            "11100": ',',
            "11101": '-',
            "11110": '\'',
            "11111": '?',
        }.get(key, '\0')


if __name__ == "__main__":
    try:
        while True:
            stdin = input()
            work = ""
            out = ""

            for char in stdin:
                work += MyConv.encode(char)

            while len(work) % 5 != 0:
                work += "0"

            for i in range(0, len(work), 5):
                out += MyConv.decode(work[i:i+5])

            print(out)

    except EOFError:
        pass  # End of input
```

Please note that this code relies on the input being provided line by line, and it will need to be terminated manually since there's no explicit exit condition like in the Java version. The Java program terminates when there's no more input to read (end-of-file is reached), but Python's `input()` function will raise an `EOFError` when it encounters the end-of-file (EOF), which is handled in the `except` block.

To simulate the provided test case, you can execute the program and then type "PETER POTTER" followed by hitting the Enter key in the terminal. The expected output "?D-C'KOPUA" will then be printed to the terminal. To end the input stream, you typically need to signal EOF by pressing `Ctrl + D` (Linux/Mac) or `Ctrl + Z` followed by Enter (Windows) in the terminal.
