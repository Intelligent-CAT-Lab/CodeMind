class main:
    import sys
    
    def main():
        N, K, S = map(int, input().split())
        out = sys.stdout
    
        if K == 0:
            if S == 1000000000:
                for i in range(N):
                    out.write("1 ")
            else:
                S += 1
                for i in range(N):
                    out.write(str(S) + " ")
        else:
            for i in range(N):
                if i < K:
                    out.write(str(S) + " ")
                else:
                    if S == 1000000000:
                        out.write("1 ")
                    else:
                        out.write(str(S + 1) + " ")
    
        out.flush()
    
    if __name__ == "__main__":
        main()