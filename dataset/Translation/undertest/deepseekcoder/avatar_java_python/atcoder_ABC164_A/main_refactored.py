class main:
    import sys
    
    def main():
        Sheep, Wolve = map(int, sys.stdin.readline().split())
    
        if Wolve >= Sheep:
            print("unsafe")
        else:
            print("safe")
    
    if __name__ == "__main__":
        main()