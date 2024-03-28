class main:
    def check(s):
        if s == "keyence":
            return True
        else:
            for i in range(len(s)):
                for j in range(i + 1, len(s) + 1):
                    str_comb = s[:i] + s[j:]
                    if str_comb == "keyence":
                        return True
        return False
    
    # Read input from user
    s = input()  # No need for a Scanner object in Python
    if check(s):
        print("YES")
    else:
        print("NO")