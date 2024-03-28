import org.omg.Messaging.SYNC_WITH_TRANSPORT
import java.util
import java.io
import java.util.Collections

class codeforces_373_B:
    ans = 0

    def get(self, a):
        ret = 0
        now = 1
        t = 1
        
        while True:
            if now * 10 > a:
                ret += (a - now + 1) * t
                break
            
            ret += now * 9 * t
            now *= 10
            t += 1
        
        return ret

    def binarySearch(self, k, l, r, x):
        if r >= l:
            mid = l + (r - l) // 2
            
            if mid > self.ans and mid * k <= x:
                self.ans = mid
            
            if k * mid == x:
                return mid
            
            if k * mid > x:
                return self.binarySearch(k, l, mid - 1, x)
            
            return self.binarySearch(k, mid + 1, r, x)
        
        return -1

    def main(self):
        gen, st, tim = map(int, input().split())
        gen //= tim
        beg = st - 1
        end = 10**18
        
        while True:
            med = (beg + end) // 2 + 1
            
            if self.get(med) - self.get(st - 1) > gen:
                end = med - 1
            else:
                beg = med
            
            if beg == end:
                print(beg - st + 1)
                break

if __name__ == '__main__':
    obj = codeforces_373_B()
    obj.main()