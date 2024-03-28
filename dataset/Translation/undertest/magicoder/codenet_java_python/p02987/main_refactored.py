class main:
    import sys
    
    def check_four_chars(s):
        s = sorted(s)
        if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
            return "Yes"
        else:
            return "No"
    
    if __name__ == "__main__":
        s = sys.stdin.readline().strip()
        print(check_four_chars(s))