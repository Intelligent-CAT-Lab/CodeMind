class main:
    def main():
        N = int(input())
    
        # No need to define the size of the list in Python beforehand
        out = []  
        
        while True:
            N = N - 1  
            x = N // 26
            y = N % 26
            out.append(chr(ord('a') + y))
            if x == 0:
                break
            N = x
    
        # Reversing the output string since we filled it in reversed order
        print(''.join(reversed(out)))
    
    if __name__ == "__main__":
        main()