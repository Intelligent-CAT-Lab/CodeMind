def find_length(s):
    s1 = ""
    s2 = ""
    answer = ""
    for i in range(len(s), 1, -2):
        S = s[0:i]
        s1 = S[0: len(S)//2]
        s2 = S[len(S)//2: len(S)]
        if s1 == s2 and len(S) != len(s):
            answer = S
            break
    return len(answer)

# Test input
print(find_length("abaababaab"))