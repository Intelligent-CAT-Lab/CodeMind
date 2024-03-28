class main:
    import sys
    
    def solve(s):
        s1 = ""
        s2 = ""
        answer = ""
    
        for i in range(len(s), 2, -2):
            S = s[:i]
            s1 = S[:len(S) // 2]
            s2 = S[len(S) // 2:]
    
            if s1 == s2 and len(S) != len(s):
                answer = S
                break
    
        return len(answer)
    
    if __name__ == "__main__":
        s = sys.stdin.readline().strip()
        print(solve(s))