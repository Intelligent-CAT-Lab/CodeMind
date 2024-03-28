class main:
    import sys
    
    MASK = [1, 2, 4]
    
    def main():
        M = int(sys.stdin.readline().strip())
        result = (24 - M) + 24
        print(result)
    
    if __name__ == "__main__":
        main()