
import sys
import trace
import os
import unittest
class Interpolation:
    def __init__(self):
        pass

    @staticmethod
    def interpolate_1d(x, y, x_interp):
        y_interp = []
        for xi in x_interp:
            for i in range(len(x) - 1):
                if x[i] <= xi <= x[i+1]:
                    yi = y[i] + (y[i+1] - y[i]) * (xi - x[i]) / (x[i+1] - x[i])
                    y_interp.append(yi)
                    break
        return y_interp
    
    @staticmethod
    def interpolate_2d(x, y, z, x_interp, y_interp):
        z_interp = []
        for xi, yi in zip(x_interp, y_interp):
            for i in range(len(x) - 1):
                if x[i] <= xi <= x[i+1]:
                    for j in range(len(y) - 1):
                        if y[j] <= yi <= y[j+1]:
                            z00 = z[i][j]
                            z01 = z[i][j+1]
                            z10 = z[i+1][j]
                            z11 = z[i+1][j+1]
                            zi = (z00 * (x[i+1] - xi) * (y[j+1] - yi) +
                                  z10 * (xi - x[i]) * (y[j+1] - yi) +
                                  z01 * (x[i+1] - xi) * (yi - y[j]) +
                                  z11 * (xi - x[i]) * (yi - y[j])) / ((x[i+1] - x[i]) * (y[j+1] - y[j]))
                            z_interp.append(zi)
                            break
                    break
        return z_interp
class Test(unittest.TestCase):
    def test(self):
            interpolation = Interpolation()
            return interpolation.interpolate_2d([1, 2, 3], [1, 2, 3], [[1, 2, 3], [4, 5, 6], [7, 8, 9]], [1.5, 2.5], [1.5, 2.5])
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_46@Interpolation.interpolate_2d/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
