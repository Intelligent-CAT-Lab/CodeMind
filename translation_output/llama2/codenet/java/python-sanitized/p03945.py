import java.util

class p03945:
    def __init__(self):
        pass

    def main(self):
        s = input()
        str = []
        for i in range(len(s)):
            str.append(s[i])
        counter = 0
        for i in range(len(str) - 1):
            if str[i] != str[i + 1]:
                counter += 1
        print(counter)