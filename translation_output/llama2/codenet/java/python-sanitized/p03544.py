import java.util

class p03544:
    def main(self, args):
        n = int(input())
        num = [2] * 100
        for i in range(1, 100):
            num[i] = num[i - 1] + num[i - 2]
        print(num[n])


if __name__ == '__main__':
    p03544().main(None)