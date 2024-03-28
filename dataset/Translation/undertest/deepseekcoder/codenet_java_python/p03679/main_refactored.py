class main:
    import sys
    
    def main():
        line = sys.stdin.readline().strip()
        overLimit, prevDay, overDay = map(int, line.split())
    
        if prevDay >= overDay:
            print("delicious")
        elif prevDay + overLimit < overDay:
            print("dangerous")
        else:
            print("safe")
    
    if __name__ == "__main__":
        main()