class main:
    def main():
        K = int(input())
        N = 50
        list_ = [K // N + i for i in range(N)]
        for i in range(K % N):
            list_[i % N] += N + 1
            list_ = [x - 1 for x in list_]
        print(N)
        print(*list_)
    
    if __name__ == "__main__":
        main()