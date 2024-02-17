# ハフマン符号
# https://onlinejudge.u-aizu.ac.jp/courses/lesson/1/ALDS1/15/ALDS1_15_D

from collections import Counter
import heapq


class Node:
    def __init__(self, count, val=None, left=None, right=None):
        self.val = val
        self.count = count
        self.left = left
        self.right = right

    def __lt__(self, other):
        return self.count < other.count


class HuffmanCoding:
    def __init__(self, s: str):
        self.s = s
        self.counts = Counter(s).most_common()
        self.root = self.build_tree()
        self.encode_table = self.gen_encode_table()

    def build_tree(self):
        hq = list()
        for val, cnt in self.counts:
            heapq.heappush(hq, Node(cnt, val))
        while len(hq) > 1:
            x = heapq.heappop(hq)
            y = heapq.heappop(hq)
            cnt = x.count + y.count
            z = Node(cnt, None, y, x)
            heapq.heappush(hq, z)
        if hq:
            return heapq.heappop(hq)
        else:
            return None

    def gen_encode_table(self):
        encode_table = {}

        def traversal(node, key):
            if node.val:
                if key == "":
                    key = "0"
                encode_table[node.val] = key
            else:
                if node.left:
                    traversal(node.left, key + "1")
                if node.right:
                    traversal(node.right, key + "0")
        key = ""
        if self.root:
            traversal(self.root, key)

        return encode_table

    def get_encode_size(self):
        size = 0
        for a in self.s:
            size += len(self.encode_table[a])
        return size

    def gen_encode_bin(self):
        enc = ""
        for a in self.s:
            enc += self.encode_table[a]
        return enc


def main():
    S = input().strip()
    huffman = HuffmanCoding(S)
    print(huffman.get_encode_size())


if __name__ == "__main__":
    main()

