import java.util

class p03213:
    def factorization(self, n):
        list = []
        tmp = n
        for i in range(2, int(math.sqrt(n)) + 1):
            if tmp % i == 0:
                cnt = 0
                while tmp % i == 0:
                    cnt += 1
                    tmp //= i
                list.append([i, cnt])
        if tmp != 1:
            list.append([tmp, 1])
        if list == []:
            list.append([n, 1])
        return list

    def main(self):
        n = int(input())
        map = {}
        for i in range(2, n + 1):
            list = self.factorization(i)
            for x in list:
                map[x[0]] = map.get(x[0], 0) + x[1]
        values = []
        for k, v in map.items():
            values.append(v)
        values.sort()
        values.reverse()
        ans = 0
        for v in values:
            if v >= 74:
                ans += 1
        for v in values:
            if v >= 24:
                for i in range(len(values)):
                    if i == j:
                        continue
                    if v >= 2:
                        ans += 1
        for v in values:
            if v >= 14:
                for i in range(len(values)):
                    if i == j:
                        continue
                    if v >= 4:
                        ans += 1
        for v in values:
            if v >= 4:
                for i in range(len(values)):
                    if i == j:
                        continue
                    if v >= 4:
                        for k in range(len(values)):
                            if i == k or j == k:
                                continue
                            if v >= 2:
                                ans += 1
        print(ans)