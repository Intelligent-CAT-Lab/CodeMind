class main:
    def main():
        s = input()
        str = ""
    
        for i in range(len(s)):
            if s[i] == '.':
                str += '0'
            else:
                if s[i] == '-' and s[i + 1] == '.':
                    str += '1'
                else:
                    str += '2'
                    i += 1
    
        print(str)
    
    if __name__ == "__main__":
        main()