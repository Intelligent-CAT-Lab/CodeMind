class Solution:
    def solve(self, s):
        c_index = s.find('C')
        f_index = s.rfind('F')
        if c_index < 0 or f_index < 0 or f_index < c_index:
            return 'No'
        else:
            return 'Yes'

if __name__ == '__main__':
    s = input()
    solution = Solution()
    print(solution.solve(s))