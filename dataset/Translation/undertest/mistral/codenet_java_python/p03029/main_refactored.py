class main:
    import sys
    
    def main():
        try:
            input_str = sys.stdin.readline().strip().split()
            A = int(input_str[0])
            P = int(input_str[1])
            print((P + 3 * A) / 2)
        except Exception as e:
            print("Exception:", e)
    
    if __name__ == "__main__":
        main()