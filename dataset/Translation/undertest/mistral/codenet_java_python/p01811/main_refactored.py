class main:
    def solve(S):
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 3):
                if S[i:i+3] == "ABC":
                    S = S[:i] + "X" + S[i+3:]
                    abc = True
            if not abc:
                return "No"