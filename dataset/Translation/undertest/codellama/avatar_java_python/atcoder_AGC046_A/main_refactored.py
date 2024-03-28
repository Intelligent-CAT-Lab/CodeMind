class main:
    import sys
    
    def main():
        try:
            i = int(input())
            k = 360
            j = 1
            while not (i * j) % k == 0:
                j += 1
            print(j)
        except ValueError:
            print("Invalid input", file=sys.stderr)
    
    if __name__ == "__main__":
        main()