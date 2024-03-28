class main:
    n = int(input())
    
    def func(n):
        if n == 1:
            return ['a']
        else:
            prev_list = func(n-1)
            new_list = []
            for s in prev_list:
                max_char = ord('a')
                for i in range(len(s)):
                    if ord(s[i]) > max_char:
                        max_char = ord(s[i])
                for c in range(ord('a'), max_char+1):
                    new_string = s + chr(c)
                    new_list.append(new_string)
            return new_list
    
    print(func(n))