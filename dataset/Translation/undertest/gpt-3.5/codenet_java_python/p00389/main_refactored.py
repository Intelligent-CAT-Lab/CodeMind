class main:
    def main():
        base, K = map(int, input().split())
        next_val = 0
        ans = 1
        while base >= 1:
            low, high = 0, base
            while high - low > 1:
                will_next = (low + high) // 2
                if will_next <= K*(base - will_next):  # OK
                    low = will_next
                else:
                    high = will_next
            next_val = low
    
            if next_val > 0:
                base = next_val
                ans += 1
            else:
                break
    
        print(ans)
    
    if __name__ == "__main__":
        main()