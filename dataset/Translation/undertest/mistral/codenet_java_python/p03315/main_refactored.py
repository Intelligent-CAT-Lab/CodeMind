class main:
    # Sample test case
    input = "+++"
    
    # Expected output
    output = 2
    
    # Translated code
    def main():
        ary = input.tochararray()
        num = 0
        for c in ary:
            if c == '+':
                num += 1
            else:
                num -= 1
        print(num)
    
    if __name__ == "__main__":
        main()