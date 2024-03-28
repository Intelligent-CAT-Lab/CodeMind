class main:
    def main():
        a = input()
    
        b = list(a)
    
        c = len(a)
    
        if c == 3:
            temp = b[0]
            b[0] = b[2]
            b[2] = temp
    
        for i in range(c):
            print(b[i], end='')
    
    
    if __name__ == "__main__":
        main()