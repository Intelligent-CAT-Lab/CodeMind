class main:
    def find_substring(s):
        for i in range(len(s), 0, -2):
            sub = s[0:i]
            s1 = sub[0:len(sub)//2]
            s2 = sub[len(sub)//2:len(sub)]
            if s1 == s2 and len(sub) != len(s):
                return len(sub)
        return 0
    
    s = input()
    print(find_substring(s))