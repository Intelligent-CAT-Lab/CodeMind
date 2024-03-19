class p02534:
    def __init__(self, K):
        self.K = K

    def solve(self):
        answer = ""
        for i in range(self.K):
            answer += "ACL"
        return answer

    def show(self, answer):
        print(answer)


# Test input
K = 3
m = p02534(K)
m.show(m.solve())