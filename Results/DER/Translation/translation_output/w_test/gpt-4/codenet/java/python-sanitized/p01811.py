class Task:
    def solve(self, S):
        while len(S) > 3:
            abc = False
            for i in range(len(S)-2):
                if S[i:i+3] == "ABC":
                    S = S[:i] + "X" + S[i+3:]
                    abc = True
            if not abc:
                return "No"

            check = [False]*3
            for i in range(len(S)):
                if ord(S[i]) - ord('A') >= 3:
                    continue
                check[ord(S[i]) - ord('A')] = True
            cnt = check.count(True)
            if cnt != 2:
                return "No"
            for i in range(3):
                if not check[i]:
                    c = chr(i + ord('A'))
                    S = S.replace("X", c)

        if S == "ABC":
            return "Yes"
        else:
            return "No"

# Sample test case
S = input()
task = Task()
result = task.solve(S)
print(result)