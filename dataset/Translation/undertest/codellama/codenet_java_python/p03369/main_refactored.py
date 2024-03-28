class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        print((len(s) - len(s.replace("o", ""))) * 100 + 700)
    
    if __name__ == "__main__":
        main()