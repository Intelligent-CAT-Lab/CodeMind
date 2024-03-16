import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

def get_input():
    bufferedReader = BufferedReader(InputStreamReader(System.in))
    def get_char_array():
        char_array = []
        try:
            string = get_input_string()
            for i in range(len(string)):
                char_array.append(string[i])
            return char_array
        except Exception as e:
            e.printStackTrace()
        char_array = []
        return char_array
    def get_array_int():
        string = bufferedReader.readline().split(" ")
        array = []
        try:
            for i in range(len(string)):
                array.append(int(string[i]))
            return array
        except IOException as e:
            e.printStackTrace()
        array = [0, 0]
        return array
    def get_int():
        try:
            string = bufferedReader.readline()
            return int(string)
        except IOException as e:
            e.printStackTrace()
        return 0
    def get_input_string():
        try:
            string = StringBuilder()
            string.append(bufferedReader.readline())
            return string
        except IOException as e:
            e.printStackTrace()
        return StringBuilder()
    def get_long_input():
        try:
            string = bufferedReader.readline()
            return long(string)
        except IOException as e:
            e.printStackTrace()
        return 0
    def get_long_array_input():
        string = bufferedReader.readline().split(" ")
        array = []
        try:
            for i in range(len(string)):
                array.append(long(string[i]))
            return array
        except IOException as e:
            e.printStackTrace()
        array = [0, 0]
        return array

def p02700():
    insn = get_array_int()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c // b
    tt = c % b
    y = a // d
    u = a % d

    while a >= 0 or c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            return
        a = a - d
        if a <= 0:
            print("No")
            return

def ff(combination_sum):
    return (combination_sum % (10**9 + 7))

def combination_sum(n, coins, l):
    if n < 0:
        return -1
    if n == 0:
        return l

    coin_count = float('inf')
    for coin in coins:
        curr_coin = combination_sum(n - coin, coins, l + 1)
        if curr_coin == -1:
            continue
        if curr_coin < coin_count:
            coin_count = curr_coin
    if coin_count == float('inf'):
        return -1
    return coin_count

p02700()