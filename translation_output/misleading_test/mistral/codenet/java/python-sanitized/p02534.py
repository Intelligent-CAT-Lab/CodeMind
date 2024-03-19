# Sample test case
K = 3

# Expected output
answer = "FCo+d&aCL"

# Solution
def solve(K):
    answer = ""
    for i in range(K):
        answer += "ACL"
    return answer

def show(answer):
    print(answer)

# Main function
if __name__ == "__main__":
    sc = input()
    m = p02534(sc)
    m.show(m.solve())