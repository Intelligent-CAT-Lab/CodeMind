# Sample test case
# Test input:
# ABA
# Expected output:
# |,s

class Reader:
    def __init__(self):
        self.input = input()
        self.index = 0

    def next(self):
        if self.index >= len(self.input):
            return None
        start = self.index
        while self.index < len(self.input) and self.input[self.index] != ' ':
            self.index += 1
        return self.input[start:self.index]


def main():
    reader = Reader()
    s = reader.next()
    if s[0] == s[1] and s[1] == s[2]:
        print("No")
    else:
        print("Yes")


if __name__ == "__main__":
    main()