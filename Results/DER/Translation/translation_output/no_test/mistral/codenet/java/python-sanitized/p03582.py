import java.util.ArrayList
import java.util.Collections
import java.util.List

def solve():
    a = [na(3)]
    list = ArrayList()
    for j in range(3):
        for i in range(a[j]):
            list.append("" + (char)(ord('a') + j))

    while len(list) > 1:
        Collections.sort(list)
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        list.pop()

    print(list[0])

def main():
    thread = Thread(target=run, args=("", 64000000))
    thread.start()

def run():
    start = time.time()
    debug = os.environ.get("debug")
    if debug:
        try:
            is = open(os.path.join(debug, "input.txt"), "rb")
        except Exception as e:
            raise RuntimeError(e)
    reader = BufferedReader(InputStreamReader(is), 32768)
    solve()
    out.flush()
    tr((time.time() - start) * 1000)

is = sys.stdin
out = sys.stdout
tokenizer = None
reader = None

def next():
    while tokenizer is None or not tokenizer.has_more_tokens():
        try:
            tokenizer = StringTokenizer(reader.readline())
        except Exception as e:
            raise RuntimeError(e)
    return tokenizer.next_token()

def nd():
    return float(next())

def nl():
    return int(next())

def na(n):
    a = [ni() for _ in range(n)]
    return a

def ns():
    return next().to_char_array()

def nal(n):
    a = [nl() for _ in range(n)]
    return a

def ntable(n, m):
    table = [[ni() for _ in range(m)] for _ in range(n)]
    return table

def nlist(n, m):
    table = [[ni() for _ in range(n)] for _ in range(m)]
    return table

def ni():
    return int(next())

def tr(*args):
    if is != sys.stdin:
        print(args)

# Your code here