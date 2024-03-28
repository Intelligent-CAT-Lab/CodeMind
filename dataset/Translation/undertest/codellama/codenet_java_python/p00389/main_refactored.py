class main:
    import sys
    
    def main():
        base, K = map(int, sys.stdin.readline().split())
        ans = 1
        while base >= 1:
            low = 0
            high = base
            while high - low > 1:
                will_next = (low + high) // 2
                if will_next <= K * (base - will_next):
                    low = will_next
                else:
                    high = will_next
            next = low
            if next > 0:
                base = next
                ans += 1
            else:
                break
        print(ans)
    
    
    if __name__ == "__main__":
        main()