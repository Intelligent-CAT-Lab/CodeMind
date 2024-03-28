class main:
    import sys
    
    class p02534:
        def __init__(self, sc):
            self.sc = sc
            self.K = sc.nextInt()
    
        def solve(self):
            answer = ""
            for i in range(self.K):
                answer += "ACL"
            return answer
    
        def show(self, answer):
            print(answer)
    
    if __name__ == "__main__":
        sc = sys.stdin
        p02534(sc).show(p02534(sc).solve())