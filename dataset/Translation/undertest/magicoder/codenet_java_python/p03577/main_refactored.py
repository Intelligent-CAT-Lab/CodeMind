class main:
    import sys
    
    def main():
        line = sys.stdin.readline().strip()
        print(line[:-8])
    
    if __name__ == "__main__":
        main()