class Node(object):
    def __init__(self, a, b):
        self.a = a
        self.b = b
        if a <= 3 and b == 5:
            self.left = None
            self.right = None
        elif a == 5 and b <= 3:
            self.left = None
            self.right = None
        elif (a, b) in ((5, 5), (6, 4), (4, 6)):
            self.left = None
            self.right = None
        else:
            self.left = Node(a+1, b)
            self.right = Node(a, b+1)
    def prints(self):
        print "%d %d" % (self.a, self.b)
def parse(n, a, b, s):
    if n.a == a and n.b == b:
        print s
    else:
        if n.left != None:
            s1 = s +  'A'
            parse(n.left, a, b, s1)
            s2 = s + 'B'
            parse(n.right, a, b, s2)
read = map(int, "2 2".split())
n = Node(0, 0)
st = ""
parse(n, read[0], read[1], st)