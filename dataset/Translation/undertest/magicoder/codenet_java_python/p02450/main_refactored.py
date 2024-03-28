class main:
    def permutation(q, ans):
        # Base Case
        if len(q) <= 1:
            if ans != "":
                ans += " "
            print(ans + q)
        # General Case
        else:
            for i in range(len(q)):
                if ans == "":
                    permutation(q[:i] + q[i+1:], ans + q[i])
                else:
                    permutation(q[:i] + q[i+1:], ans + " " + q[i])
    
    n = int(input())
    str = ""
    
    for i in range(1, n+1):
        str += str(i)
    
    permutation(str, "")