import java.util.Scanner

def main():
    sc = Scanner(System.in)
    s = sc.next()
    arr = s.tochararray()
    for i in range(len(arr)):
        if arr[i] == 'b':
            arr[i] = 'd'
        elif arr[i] == 'd':
            arr[i] = 'b'
        elif arr[i] == 'p':
            arr[i] = 'q'
        elif arr[i] == 'q':
            arr[i] = 'p'
    sb = StringBuilder(str(arr))
    sb.reverse()
    if s == sb.str():
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()