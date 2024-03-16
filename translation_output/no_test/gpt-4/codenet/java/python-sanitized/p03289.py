S = input()
if S[0] != 'A':
    print("WA")
else:
    count = S.count('C', 2, len(S) - 1)
    if count != 1:
        print("WA")
    else:
        index = S.find('C', 2, len(S) - 1)
        if any(char.isupper() for i, char in enumerate(S) if i not in {0, index}):
            print("WA")
        else:
            print("AC")