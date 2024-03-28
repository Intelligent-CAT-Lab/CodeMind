import sys

class p02534:
    def __init__(self):
        self.K = int(sys.stdin.readline().strip())

    def solve(self):
        answer = ""
        for i in range(self.K):
            answer += "ACL"
        return answer

    def show(self, answer):
        print(answer)

if __name__ == "__main__":
    m = p02534()
    m.show(m.solve())