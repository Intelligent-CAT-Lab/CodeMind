class p02534:
    def __init__(self, K):
        self.K = K

    def solve(self):
        answer = "ACL" * self.K
        return answer

    def show(self, answer):
        print(answer)

if __name__ == "__main__":
    K = int(input())
    m = p02534(K)
    m.show(m.solve())