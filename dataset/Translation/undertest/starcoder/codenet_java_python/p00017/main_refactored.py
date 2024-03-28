class main:
    import sys
    
    def main():
        for line in sys.stdin:
            line = line.strip()
            for i in range(26):
                converted = ""
                for c in line:
                    if c >= 'a' and c <= 'z':
                        converted += chr(ord(c) + i <= ord('z')? ord(c) + i : ord(c) + i - 26)
                    else:
                        converted += c
                if converted.find("the")!= -1 or converted.find("this")!= -1 or converted.find("that")!= -1:
                    print converted
                    break
    
    if __name__ == "__main__":
        main()