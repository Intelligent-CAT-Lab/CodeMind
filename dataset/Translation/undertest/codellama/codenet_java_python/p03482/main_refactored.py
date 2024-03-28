class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        ans = 0
        if len(s) % 2 == 0:
            if s[len(s) // 2 - 1] != s[len(s) // 2]:
                print(len(s) // 2)
                return
            else:
                s = s[:len(s) // 2] + s[len(s) // 2 + 1:]
                ans = 1
        mid = len(s) // 2
        for i in range(1, len(s) - mid + 1):
            if i + mid == len(s) or s[mid + i] != s[mid] or s[mid - i] != s[mid]:
                ans += mid + i
                break
        print(ans)
    
    if __name__ == "__main__":
        main()
    
    
    Otherwise, it calculates the middle index of the string and starts a loop that iterates from 1 to the length of the string minus the middle index. For each iteration, it checks if the character at the current index is the same as the character at the middle index, and if the character at the current index plus the middle index is the same as the character at the middle index. If these conditions are not met, it adds the current index to the answer and breaks the loop.