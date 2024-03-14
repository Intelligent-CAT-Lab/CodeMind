import sys

class p00017:

    @staticmethod
    def main():
        p00017().compute()

    def compute(self):
        for line in sys.stdin:
            for i in range(26):
                converted = ""
                for j in range(len(line)):
                    c = line[j]
                    if 'a' <= c <= 'z':
                        converted += chr(ord(c) + i) if ord(c) + i <= ord('z') else chr(ord(c) + i - 26)
                    else:
                        converted += c
                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break

if __name__ == "__main__":
    p00017.main()