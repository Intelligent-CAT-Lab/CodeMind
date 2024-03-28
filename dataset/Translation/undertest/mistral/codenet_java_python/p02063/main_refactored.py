class main:
    import time
    
    def main():
        A = int(input())
        B = int(input())
        start_time = time.time()
        for i in range(B+1, -1, -1):
            ca = i // A + i % A
            remb = i % B
            cb = i // B + remb // A + remb % A
            if ca < cb:
                print(i)
                return
        print(-1)
    
    if __name__ == "__main__":
        main()