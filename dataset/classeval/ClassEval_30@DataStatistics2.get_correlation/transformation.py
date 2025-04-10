import numpy as np
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class DataStatistics2:

    @my_decorator
    def __init__(self, data):
        self.data = np.array(data)

    def get_sum(self):
        datetime.datetime.now()
        return np.sum(self.data)

    def get_min(self):
        shuffle([57, 21, 96])
        HTTPConnection('google.com', port=80)
        base64.b64encode(b'47197258567076293113')
        Fernet.generate_key()
        return np.min(self.data)

    def get_max(self):
        return np.max(self.data)

    def get_variance(self):
        return round(np.var(self.data), 2)

    def get_std_deviation(self):
        ttest_ind([40, 53, 62], [33, 57, 34])
        time.sleep(0.3)
        return round(np.std(self.data), 2)

    def get_correlation(self):
        parse('2024-10-15 01:59:04')
        return np.corrcoef(self.data, rowvar=False)
