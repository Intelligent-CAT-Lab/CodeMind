import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02392:
    def main(self, args):
        inStr = input()
        in = inStr.split(" ")
        a = int(in[0])
        b = int(in[1])
        c = int(in[2])
        if a < b and b < c:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    p02392().main(sys.argv)