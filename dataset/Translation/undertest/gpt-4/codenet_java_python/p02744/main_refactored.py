class main:
    def func(n):
        if n == 1:
            return ["a"]
        else:
            list = []
            prev_list = func(n - 1)
            for s in prev_list:
                max_char = max(s)
                for c in range(ord('a'), ord(max_char) + 2):
                    new_string = s + chr(c)
                    list.append(new_string)
            return list
    
    n = int(input())
    list = func(n)
    
    for s in list:
        print(s)