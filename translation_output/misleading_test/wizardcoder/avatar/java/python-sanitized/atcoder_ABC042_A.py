import java.util.*;

class atcoder_ABC042_A:
    def main(self):
        scan = Scanner(System.in)
        str = scan.next()
        num_1 = int(str)

        str = scan.next()
        num_2 = int(str)

        str = scan.next()
        num_3 = int(str)

        if num_1 == 7:
            if num_2 == 5 and num_3 == 5:
                print("YES")
            else:
                print("NO")
        elif num_2 == 7:
            if num_1 == 5 and num_3 == 5:
                print("YES")
            else:
                print("NO")
        elif num_3 == 7:
            if num_2 == 5 and num_1 == 5:
                print("YES")
            else:
                print("NO")