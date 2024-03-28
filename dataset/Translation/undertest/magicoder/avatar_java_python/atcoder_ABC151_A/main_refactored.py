class main:
    import sys
    
    def main():
        c = sys.stdin.readline().strip()
        print(chr(ord(c) + 1))
    
    if __name__ == "__main__":
        main()