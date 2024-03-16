import sys

class p02534:
    def __init__(self, sc):
        self.sc = sc
        self.K = int(sc.readline())

    def solve(self):
        answer = ""
        for i in range(self.K):
            answer += "ACL"
        return answer

    def show(self, answer):
        print(answer)

if __name__ == "__main__":
    sc = sys.stdin
    m = p02534(sc)
    m.show(m.solve())