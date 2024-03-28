def solve(k):
    answer = ""
    for i in range(k):
        answer += "ACL"
    return answer

def show(answer):
    print(answer)

if __name__ == '__main__':
    k = int(input())
    m = solve(k)
    show(m)