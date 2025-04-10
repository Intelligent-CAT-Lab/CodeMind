import unittest
import numpy as np


class KappaCalculator:

    @staticmethod
    def kappa(testData, k):
        dataMat = np.mat(testData)
        P0 = 0.0
        for i in range(k):
            P0 += dataMat[i, i] * 1.0
        xsum = np.sum(dataMat, axis=1)
        ysum = np.sum(dataMat, axis=0)
        sum = np.sum(dataMat)
        Pe = float(ysum * xsum) / sum / sum
        P0 = float(P0 / sum * 1.0)
        cohens_coefficient = float((P0 - Pe) / (1 - Pe))
        return cohens_coefficient

    @staticmethod
    def fleiss_kappa(testData, N, k, n):
        dataMat = np.mat(testData, float)
        oneMat = np.ones((k, 1))
        sum = 0.0
        P0 = 0.0
        for i in range(N):
            temp = 0.0
            for j in range(k):
                sum += dataMat[i, j]
                temp += 1.0 * dataMat[i, j] ** 2
            temp -= n
            temp /= (n - 1) * n
            P0 += temp
        P0 = 1.0 * P0 / N
        ysum = np.sum(dataMat, axis=0)
        for i in range(k):
            ysum[0, i] = (ysum[0, i] / sum) ** 2
        Pe = ysum * oneMat * 1.0
        ans = (P0 - Pe) / (1 - Pe)
        return ans[0, 0]
class Test(unittest.TestCase):
    def test(self):
            return KappaCalculator.kappa([[2, 2, 1], [1, 2, 1], [1, 1, 2]], 3)