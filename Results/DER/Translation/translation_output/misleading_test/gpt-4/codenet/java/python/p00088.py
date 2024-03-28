Below is the translated version of the provided Java code to Python:

```python
class MyConv:
    @staticmethod
    def Encode(key):
        return {
            ' ': "101",
            '\'': "000000",
            ',': "000011",
            '-': "10010001",
            '.': "010001",
            '?': "000001",
            'A': "100101",
            'B': "10011010",
            'C': "0101",
            'D': "0001",
            'E': "110",
            'F': "01001",
            'G': "10011011",
            'H': "010000",
            'I': "0111",
            'J': "10011000",
            'K': "0110",
            'L': "00100",
            'M': "10011001",
            'N': "10011110",
            'O': "00101",
            'P': "111",
            'Q': "10011111",
            'R': "1000",
            'S': "00110",
            'T': "00111",
            'U': "10011100",
            'V': "10011101",
            'W': "000010",
            'X': "10010010",
            'Y': "10010011",
            'Z': "10010000"
        }.get(key, "")
    
    @staticmethod
    def Decode(key):
        decode_map = {
            "00000": 'A', "00001": 'B', "00010": 'C',
            "00011": 'D', "00100": 'E', "00101": 'F',
            "00110": 'G', "00111": 'H', "01000": 'I',
            "01001": 'J', "01010": 'K', "01011": 'L',
            "01100": 'M', "01101": 'N', "01110": 'O',
            "01111": 'P', "10000": 'Q', "10001": 'R',
            "10010": 'S', "10011": 'T', "10100": 'U',
            "10101": 'V', "10110": 'W', "10111": 'X',
            "11000": 'Y', "11001": 'Z', "11010": ' ',
            "11011": '.',
            "11100": ',', "11101": '-',
            "11110": '\'', "11111": '?'
        }
        return decode_map.get(key, 0)


def main():
    try:
        while True:
            stdin = input()
            if stdin == "":
                break
            work = ""
            out = ""
            
            for loop in range(len(stdin)):
                work += MyConv.Encode(stdin[loop])
                
            while len(work) % 5 != 0:
                work += "0"
                
            for loop in range(0, len(work), 5):
                out += MyConv.Decode(work[loop:loop + 5])
                
            print(out)
    except EOFError:
        pass


if __name__ == "__main__":
    main()
```

This script reads from the standard input until an empty line or EOF (Ctrl+D or equivalent). It encodes the characters using `MyConv.Encode`, pads the working string with '0's to a multiple of five characters, then decodes blocks of five characters using `MyConv.Decode`, and prints the decoded string.

Here is how you could do the sample test case manually:
```python
print(MyConv.Decode(MyConv.Encode('P').ljust(5, '0') + 
                    MyConv.Encode('E').ljust(5, '0') + 
                    MyConv.Encode('T').ljust(5, '0') + 
                    MyConv.Encode('E').ljust(5, '0') + 
                    MyConv.Encode('R').ljust(5, '0') +
                    MyConv.Encode(' ').ljust(5, '0') + 
                    MyConv.Encode('P').ljust(5, '0') + 
                    MyConv.Encode('O').ljust(5, '0') + 
                    MyConv.Encode('T').ljust(5, '0') + 
                    MyConv.Encode('T').ljust(5, '0') + 
                    MyConv.Encode('E').ljust(5, '0') + 
                    MyConv.Encode('R').ljust(5, '0'))) # ?D-'KOPUA
```

Note that you will need to provide your own implementation for reading multiline input if your environment doesn't support `input()` correctly (for example, in some online judges).
