class main:
    def main():
        inputs = input().split()
        a = int(inputs[0])
        b = int(inputs[1])
        c = int(inputs[2])
        
        if b + c < a:
            print(0)
        else:
            print(b + c - a)
    
    if __name__ == "__main__":
        main()