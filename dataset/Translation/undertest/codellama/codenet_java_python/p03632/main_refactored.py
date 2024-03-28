class main:
    import sys
    
    def main():
        for line in sys.stdin:
            a, b, c, d = map(int, line.split())
            start = max(a, c)
            end = min(b, d)
            print(max(end - start, 0))
    
    if __name__ == "__main__":
        main()