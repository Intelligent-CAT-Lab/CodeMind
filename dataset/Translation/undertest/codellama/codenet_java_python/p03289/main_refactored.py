class main:
    import sys
    
    def main():
        input_string = sys.stdin.readline().strip()
        if input_string[0] != 'A':
            print("WA")
            return
        count = 0
        index = 0
        for i in range(2, len(input_string) - 1):
            if input_string[i] == 'C':
                count += 1
                index = i
        if count != 1:
            print("WA")
            return
        for i in range(len(input_string)):
            if i == 0 or i == index:
                continue
            if input_string[i] >= 'A' and input_string[i] <= 'Z':
                print("WA")
                return
        print("AC")
    
    if __name__ == "__main__":
        main()