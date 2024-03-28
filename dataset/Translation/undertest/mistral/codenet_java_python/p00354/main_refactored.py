class main:
    import sys
    
    def main():
        sc = sys.stdin
        print("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.readline().strip().split()[0] % 7])
    
    if __name__ == "__main__":
        main()