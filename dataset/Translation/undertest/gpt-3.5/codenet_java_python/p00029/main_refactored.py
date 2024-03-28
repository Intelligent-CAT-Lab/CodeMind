class main:
    def main():
        s = []
        while True:
            try:
                str = input()
                s.append(str)
            except EOFError:
                break
    
        r = [0] * len(s)
        flag = [True] * 2002
        fre = 0
    
        for i in range(len(s)):
            for j in range(i+1, len(s)):
                if s[i] == s[j] and flag[j] == True:
                    r[i] += 1
                    flag[j] = False
    
        max_val = 0
        max_index = 0
        for i in range(len(s)):
            if max_val < r[i]:
                max_val = r[i]
                max_index = i
    
        print(s[max_index], end=' ')
    
        max_len = 0
        max_index_len = 0
        for i in range(len(s)):
            if len(s[max_index_len]) < len(s[i]):
                max_len = len(s[i])
                max_index_len = i
    
        print(s[max_index_len])
    
    if __name__ == "__main__":
        main()