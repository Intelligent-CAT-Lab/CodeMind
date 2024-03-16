import java.util
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    s = sc.next()
    if len(s) < 4:
        print("No")
        return
    s2 = s[:4]
    if s2 == "YAKI":
        print("Yes")
    else:
        print("No")

main()