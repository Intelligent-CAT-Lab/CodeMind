class Solution:
    def __init__(self):
        self.intMax = 2147483647
        self.intMin = -2147483648
        self.longMax = 9223372036854775807
        self.longMin = -9223372036854775808

    def solve(self):
        char_set = set()
        for ch in range(ord('a'), ord('z')+1):
            char_set.add(chr(ch))
        
        line = input()
        for ch in line:
            if ch in char_set:
                char_set.remove(ch)
        
        if len(char_set) > 0:
            result = line + list(char_set)[0]
            print(result)
            return
        
        if line == 'zyxwvutsrqponmlkjihgfedcba':
            print(-1)
            return
        
        self.next_permutation(line)

    def next_permutation(self, line, cur=""):
        if line[:len(cur)] > cur:
            return False
        
        if len(line) == len(cur):
            if line < cur:
                for i in range(len(line)):
                    print(cur[i], end='')
                    if line[i] != cur[i]:
                        break
                print()
                return True
            else:
                return False
        
        for ch in range(ord('a'), ord('z')+1):
            ch = chr(ch)
            if ch not in cur:
                if self.next_permutation(line, cur+ch):
                    return True
        
        return False

if __name__ == "__main__":
    solution = Solution()
    solution.solve()