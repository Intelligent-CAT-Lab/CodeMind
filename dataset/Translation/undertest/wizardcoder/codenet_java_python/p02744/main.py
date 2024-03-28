import java.util.ArrayList
import java.util.List
import java.util.Scanner

def func(n):
    if n == 1:
        return ['a']
    else:
        prevList = func(n - 1)
        result = []
        for s in prevList:
            max = 'a'
            for c in s:
                if max < c:
                    max = c
            for c in range(ord('a'), ord(max) + 1):
                newString = s + chr(c)
                result.append(newString)
        return result

if __name__ == '__main__':
    scan = Scanner(System.in)
    n = int(scan.next())
    scan.close()

    list = func(n)

    for s in list:
        print(s)