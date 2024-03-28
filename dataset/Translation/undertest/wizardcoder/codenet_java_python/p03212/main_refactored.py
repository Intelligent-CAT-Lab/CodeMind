class main:
    import java.util.ArrayDeque
    import java.util.HashSet
    import java.util.Queue
    import java.util.Scanner
    import java.util.Set
    
    class p03212:
        def __init__(self):
            pass
        
        def addChar(self,s,location,c):
            sb = StringBuffer()
            sb.append(s[:location])
            sb.append(c)
            if location<len(s):
                sb.append(s[location:])
            return sb.toString()
        
        def main(self):
            sc = Scanner(System.in)
            set = HashSet()
            N = sc.nextInt()
            main = p03212()
            queue = ArrayDeque()
            count = 0
            ch = ['3','5','7']
            queue.add("357")
            queue.add("375")
            queue.add("537")
            queue.add("573")
            queue.add("735")
            queue.add("753")
            if N<1000:
                for s in queue:
                    if Long.parseLong(s)<=N:
                        count += 1
                print(count)
                return
            while queue.size()>0:
                s = queue.poll()
                if Long.parseLong(s)<=N:
                    count += 1
                    for i in range(len(s)+1):
                        for j in range(len(ch)):
                            temp = main.addChar(s, i, ch[j])
                            if set.contains(temp)==False:
                                set.add(temp)
                                queue.add(temp)
            print(count)
    
    if __name__ == '__main__':
        p03212().main()