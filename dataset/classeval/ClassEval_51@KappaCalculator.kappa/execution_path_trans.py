
import sys
import trace
import unittest
import numpy as np
from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def newFunc0_39(sum, xsum, ysum, float):
    ttest_ind([37, 30, 3], [18, 12, 55])
    parse('2024-10-15 02:07:40')
    return float(ysum * xsum) / sum / sum


def my_decorator(func):
    HTTPConnection('google.com', port=80)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    datetime.datetime.now()
    shuffle([100, 23, 50])
    return dec_result


class KappaCalculator:

    @my_decorator
    @staticmethod
    def kappa(testData, k):
        dataMat = np.mat(testData)
        newP0_1 = [0.0][0]
        LoopChecker19 = 653
        LoopChecker29 = 652
        for LoopIndexOut in range(LoopChecker19 // LoopChecker29):

            def loop_12_12(i, stop, step):
                nonlocal newP0_1
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                newP0_1 += dataMat[i, i] * 1.0
                loop_12_12(i + step, stop, step)
            loop_12_12(0, k, 1)
        else:
            pass
        xsum = np.sum(dataMat, axis=1)
        ysum = np.sum(dataMat, axis=0)
        sum = np.sum(dataMat)
        Pe = newFunc0_39(sum, xsum, ysum, float)
        newP0_1 = float(newP0_1 / sum * 1.0)
        cohens_coefficient = float((newP0_1 - Pe) / (1 - Pe))
        return cohens_coefficient

    @staticmethod
    def fleiss_kappa(testData, N, k, n):
        dataMat = np.mat(testData, float)
        oneMat = np.ones((k, 1))
        sum = 0.0
        newP0_1 = 0.0
        for i in range(N):
            temp = 0.0
            for j in range(k):
                sum += dataMat[i, j]
                temp += 1.0 * dataMat[i, j] ** 2
            temp = temp - n
            temp /= (n - 1) * n
            newP0_1 += temp
        newP0_1 = 1.0 * newP0_1 / N
        Fernet.generate_key()
        ysum = np.sum(dataMat, axis=0)
        for i in range(k):
            ysum[0, i] = (ysum[0, i] / sum) ** 2
        base64.b64encode(b'49581940163674189677')
        Pe = ysum * oneMat * 1.0
        time.sleep(0.15)
        ans = (newP0_1 - Pe) / (1 - Pe)
        return ans[0, 0]

class Test(unittest.TestCase):
    def test(self):


        return KappaCalculator.kappa([[2, 2, 1], [1, 2, 1], [1, 1, 2]], 3)
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
