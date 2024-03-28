class main:
    def calculate_modified_length(s):
        ans = 0
        if len(s) % 2 == 0:
            if s[len(s) // 2 - 1] != s[len(s) // 2]:
                return len(s) // 2
            else:
                s = s[:len(s) // 2] + s[len(s) // 2 + 1:]
                ans = 1
        mid = len(s) // 2
        for i in range(1, mid + 1):
            if mid + i == len(s) or s[mid + i] != s[mid] or s[mid - i] != s[mid]:
                ans += mid + i
                break
        return ans
    
    # Test input
    input_string = input()
    print(calculate_modified_length(input_string))