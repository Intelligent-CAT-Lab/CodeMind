class main:
    import sys
    
    def func(n):
        if n == 1:
            return ['a']
        else:
            prev_list = func(n - 1)
            result = []
            for s in prev_list:
                max_char = 'a'
                for i in range(len(s)):
                    if max_char < s[i]:
                        max_char = s[i]
                for c in range(ord('a'), ord(max_char) + 2):
                    new_string = s + chr(c)
                    result.append(new_string)
            return result
    
    def main():
        n = int(sys.stdin.readline())
        list = func(n)
        for s in list:
            print(s)
    
    if __name__ == '__main__':
        main()