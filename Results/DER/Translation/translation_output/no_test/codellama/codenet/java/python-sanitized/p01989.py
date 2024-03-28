import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

class p01989:
    def solve(in, out, ms):
        s = in.next()
        length = len(s)
        ans = 0

        for i in range(1, length - 2):
            for j in range(i + 1, length - 1