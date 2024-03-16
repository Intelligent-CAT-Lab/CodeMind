import java.util.Arrays
import java.util.LinkedList
import java.util.Scanner

class p01473:
    
    MAX = 20
    
    def main(self):
        sc = Scanner(System.in)
        
        facts = [1] * (self.MAX + 1)
        for i in range(1, self.MAX + 1):
            facts[i] = facts[i - 1] * i
        
        count = [0] * 26
        input = sc.next().toCharArray()
        for c in input:
            count[ord(c) - ord('a')] += 1
        
        allow_odd = 0 if input.length % 2 == 0 else 1
        odd_count = 0
        odd_pos = -1
        for i in range(26):
            if count[i] % 2 == 1:
                odd_count += 1
                odd_pos = i
        
        if allow_odd < odd_count:
            print(0)
            return
        
        if odd_pos!= -1:
            count[odd_pos] -= 1
        
        for i in range(26):
            count[i] //= 2
        
        valid = sum(count)
        
        #print(Arrays.toString(count))
        
        sum = facts[valid]
        for i in range(26):
            sum //= facts[count[i]]
        
        print(sum)

p01473().main()