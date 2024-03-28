class main:
    def count_letters():
        res = [0] * 26
        
        while True:
            try:
                string = input().strip()
                for char in string:
                    if ord('A') <= ord(char) <= ord('Z'):
                        res[ord(char) - ord('A')] += 1
                    elif ord('a') <= ord(char) <= ord('z'):
                        res[ord(char) - ord('a')] += 1
            except EOFError:
                break
        
        for i in range(26):
            print(chr(i + ord('a')) + " : " + str(res[i]))
    
    if __name__ == "__main__":
        count_letters()