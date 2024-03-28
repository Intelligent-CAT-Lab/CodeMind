class main:
    import sys
    
    def main():
        s = sys.stdin.read(1)
        c = ord(s)
        out = chr(c + 1)
        print(out)
    
    if __name__ == "__main__":
        main()