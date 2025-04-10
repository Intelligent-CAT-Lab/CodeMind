import numpy as np
class KappaCalculator: 
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