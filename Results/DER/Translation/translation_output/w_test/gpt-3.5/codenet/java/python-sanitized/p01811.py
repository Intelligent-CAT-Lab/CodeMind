from sys import stdin, stdout

class Task:
    def solve(self, S):
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 2):
                if S[i:i+3] == "ABC":
                    S = S[:i] + "X" + S[i+3:]
                    abc = True
            if not abc:
                return "No"
            
            check = [False] * 3
            for char in S:
                if ord(char) - ord('A') >= 3:
                    continue
                check[ord(char) - ord('A')] = True
                
            cnt = sum(check)
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

if __name__ == "__main__":
    S = input().strip()
    solver = Task()
    result = solver.solve(S)
    print(result)