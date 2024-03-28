class main:
    import sys
    
    def main():
        line = sys.stdin.readline().strip()
        k, b = map(int, line.split())
    
        result = (k-1) * (b-1)
        print(result)
    
    if __name__ == "__main__":
        main()