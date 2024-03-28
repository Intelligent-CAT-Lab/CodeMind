import sys

class p02700:

    @staticmethod
    def main():
        insn = GetInput.get_array_int()
        a = insn[0]
        b = insn[1]
        c = insn[2]
        d = insn[3]

        t = c//b
        tt = c%b
        y = a//d
        u = a%d
        while a >=0 or c>=0:
            c = c - b
            if c <=0:
                print("Yes")
                return
            a = a - d
            if a<=0:
                print("No")
                return

    @staticmethod
    def ff(combination_sum):
        return int(combination_sum%(pow(10,9)+7))

    @staticmethod
    def combination_sum(n, coins, l):
        if n<0:
            return -1
        if n==0:
            return l

        coin_count = sys.maxsize
        for coin in coins:
            curr_coin = p02700.combination_sum(n - coin, coins, l+1)
            if curr_coin == -1:
                continue
            if curr_coin < coin_count:
                coin_count = curr_coin
        if coin_count == sys.maxsize:
            return -1
        return coin_count

class GetInput:
    @staticmethod
    def get_char_array():
        try:
            string = GetInput.get_input_string()
            char_array = [char for char in string]
            return char_array
        except Exception as e:
            e.printStackTrace()
        return []

    @staticmethod
    def get_array_int():
        try:
            string = sys.stdin.readline().split()
            array = [int(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        return []

    @staticmethod
    def get_int():
        try:
            string = sys.stdin.readline()
            return int(string)
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def get_input_string():
        try:
            string = sys.stdin.readline()
            return string
        except Exception as e:
            e.printStackTrace()
        return ""

    @staticmethod
    def get_long_input():
        try:
            string = sys.stdin.readline()
            return long(string)
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def get_long_array_input():
        try:
            string = sys.stdin.readline().split()
            array = [long(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        return []