def solve(S):
    while len(S) > 3:
        if S.startswith("ABC"):
            S = S[1:] + "X" + S[len(S)-3:]
        else:
            return "No"

    check = [False] * 3
    for i in range(len(S)):
        if ord(S[i])