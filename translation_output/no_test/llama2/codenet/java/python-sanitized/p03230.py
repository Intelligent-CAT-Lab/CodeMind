解析


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class p03230:
    static int v = 0
    static List<List<Integer>> ansList = None

    def main(self, args):
        br = BufferedReader(InputStreamReader(System.in))
        n = int(br.readline())
        br.close()

        if n == 1:
            print("Yes")
            print(2)
            print("1 1")
            print("1 1")
            return
        if n == 2:
            print("No")
            return

        k = 0
        for i in range(3, n + 1):
            ic2 = i * (i - 1) // 2
            if ic2 == n:
                k = i
                break
            elif ic2 > n:
                print("No")
                return

        print("Yes")

        ansList = [[] for _ in range(k)]
        target = [i for i in range(k)]
        for i in range(k):
            ansList[i] = [i]
        combination(target, 2, [])

        print(k)
        for i in range(k):
            sb = StringBuilder()
            sb.append(k - 1)
            list = ansList[i]
            for j in list:
                sb.append(j)
            sb.deleteCharAt(sb.length() - 1)
            print(sb.toString())

    def combination(self, target, k, list):
        if len(list) == k:
            v += 1
            for i in list:
                ansList[i].append(v)
            return

        i = 0
        if not list:
            i = 0
        elif list[-1] + 1 < k:
            return
        for i in range(target[i], target.length):
            list.append(i)
            combination(target, k, list)
            list.pop()