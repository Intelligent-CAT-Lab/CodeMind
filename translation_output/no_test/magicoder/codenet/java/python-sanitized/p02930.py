import sys

def solve():
    n = ni()

    ret = [[0]*n for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        print(' '.join(map(str, ret[i][i+1:])))

def dfs(left, right, level, ret):
    if left + 1 >= right:
        return

    center = (left + right) // 2

    for i in range(left, center):
        for j in range(center, right):
            ret[i][j] = level
            ret[j][j] = level

    dfs(left, center, level + 1, ret)
    dfs(center, right, level + 1, ret)

def main():
    start = time.time()
    debug = sys.argv[1] if len(sys.argv) > 1 else None
    if debug:
        global is
        is = open(debug, 'r')
    solve()
    print(f"{(time.time() - start) * 1000}ms")

if __name__ == "__main__":
    import time
    import io
    import os
    import sys
    import math
    import re
    import itertools
    import collections
    import heapq
    import bisect
    import functools
    import operator
    import array
    import string
    import random
    import timeit
    import contextlib
    import cProfile
    import pstats
    import threading
    import queue
    import copy
    import pickle
    import copyreg
    import types
    import weakref
    import collections.abc
    import builtins
    import decimal
    import fractions
    import statistics
    import functools
    import contextlib
    import contextvars
    import inspect
    import enum
    import keyword
    import tokenize
    import token
    import keyword
    import re
    import os
    import sys
    import io
    import time
    import math
    import re
    import itertools
    import collections
    import heapq
    import bisect
    import functools
    import operator
    import array
    import string
    import random
    import timeit
    import contextlib
    import cProfile
    import pstats
    import threading
    import queue
    import copy
    import pickle
    import copyreg
    import types
    import weakref
    import collections.abc
    import builtins
    import decimal
    import fractions
    import statistics
    import functools
    import contextlib
    import contextvars
    import inspect
    import enum
    import keyword
    import tokenize
    import token
    import keyword
    import re
    import os
    import sys
    import io
    import time
    import math
    import re
    import itertools
    import collections
    import heapq
    import bisect
    import functools
    import operator
    import array
    import string
    import random
    import timeit
    import contextlib
    import cProfile
    import pstats
    import threading
    import queue
    import copy
    import pickle
    import copyreg
    import types
    import weakref
    import collections.abc
    import builtins
    import decimal
    import fractions
    import statistics
    import functools
    import contextlib
    import contextvars
    import inspect
    import enum
    import keyword
    import tokenize
    import token
    import keyword
    import re
    import os
    import sys
    import io
    import time
    import math
    import re
    import itertools
    import collections
    import heapq