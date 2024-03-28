class main:
    import math
    
    def n_combination_3(c):
        count = c
        num = 0
        for i in range(count - 2):
            for j in range(i + 1, count - 1):
                for k in range(j + 1, count):
                    num += 1
        return num
    
    def main():
        sc = input("Enter a string: ")
        S = sc.split()
        current_length = 0
        length = 0
        for i in range(len(S)):
            if S[i] in ["A", "C", "G", "T"]:
                current_length += 1
            else:
                if current_length > length:
                    length = current_length
                current_length = 0
        print(max(length, current_length))
    
    if __name__ == "__main__":
        main()