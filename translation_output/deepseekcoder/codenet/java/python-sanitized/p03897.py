import sys
import io
import string
import collections

class LightScanner:
    def __init__(self, inp=sys.stdin):
        self.tokens = None
        self.inp = inp

    def string(self):
        while self.tokens is None or not len(self.tokens):
            self.tokens = list(map(str, self.inp.readline().split()))
        return self.tokens.pop(0)

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out=sys.stdout):
        self.out = out
        self.breaked = False

    def print(self, *args, **kwargs):
        sep = kwargs.get('sep', ' ')
        end = kwargs.get('end', '\n')
        output = sep.join(map(str, args)) + end
        self.out.write(output)
        self.out.flush()
        self.breaked = False

    def ans(self, *args):
        if not self.breaked:
            self.print(' ', end='')
        self.print(*args)

    def ln(self):
        self.print('\n')
        self.breaked = True

class Vec2i(collections.namedtuple('Vec2i', ['x', 'y'])):
    __slots__ = ()

    def __str__(self):
        return "({0}, {1})".format(self.x, self.y)

class JConnect