import java.util.Arrays
import java.util.Scanner

class p01479:
    MAX = 1000000

    def main(self):
        sc = Scanner(System.in)

        line = sc.next().replace("egg", "e").replace("chicken", "c")
        line = line.replace("ee", "e e").replace("ee", "e e")\
               .replace("cc", "c c").replace("cc", "c c")
        strs = line.split(" ")
        max = 0
        ans = ""
        for i in range(len(strs)):
            if max < len(strs[i]):
                max = len(strs[i])
                ans = "egg" if strs[i][max-1] == 'e' else "chicken"
        print(ans)

p01479().main()