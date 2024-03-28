class main:
    import sys
    
    class p02534:
        def __init__(self, K):
            self.K = K
    
        def solve(self):
            return "ACL" * self.K
    
        def show(self, answer):
            print(answer)
    
    # Input
    K = int(input())
    m = p02534(K)
    answer = m.solve()
    m.show(answer)