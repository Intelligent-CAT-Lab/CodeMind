class main:
    import sys
    
    def main():
        a = sys.stdin.readline().strip()
        b = sys.stdin.readline().strip()
        if a == b:
            print("H")
        else:
            print("D")
    
    if __name__ == "__main__":
        main()