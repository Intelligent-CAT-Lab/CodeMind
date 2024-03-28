import sys

class Solution:
    def __init__(self):
        self.list = [1,2,3,4,5,6,7,8,9]
        self.k = 0
        self.val = -1

    def main(self):
        self.k = int(sys.stdin.readline())
        self.get_val()
        print(self.val)

    def get_val(self):
        while self.k > 0:
            self.val = self.list[0]
            self.list.remove(self.list[0])
            if self.val % 10!= 0:
                self.list.append(10*self.val + self.val%10 - 1)
            self.list.append(10*self.val + self.val%10)
            if self.val % 10!= 9:
                self.list.append(10*self.val + self.val%10 + 1)
            self.k -= 1

if __name__ == '__main__':
    sol = Solution()
    sol.main()