import java.util

class p03889:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        arr = s.toCharArray()
        for i in range(len(arr)):
            if arr[i] == 'b':
                arr[i] = 'd'
            elif arr[i] == 'd':
                arr[i] = 'b'
            elif arr[i] == 'p':
                arr[i] = 'q'
            elif arr[i] == 'q':
                arr[i] = 'p'
        sb = java.lang.StringBuilder(new java.lang.String(arr))
        sb.reverse()
        if s == sb.toString():
            print("Yes")
        else:
            print("No")