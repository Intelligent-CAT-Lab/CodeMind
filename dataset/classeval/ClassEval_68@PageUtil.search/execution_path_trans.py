
import sys
import trace
import unittest
from sklearn.utils import shuffle
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def newFunc0_23(variable_6_23, page_size, self):
    HTTPConnection('google.com', port=80)
    base64.b64encode(b'37071996997167155008')
    return (self.total_items + page_size - variable_6_23) // page_size


def my_decorator(func):
    Fernet.generate_key()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    datetime.datetime.now()
    return dec_result


class PageUtil:

    @my_decorator
    def __init__(self, data, page_size):
        self.data = data
        self.page_size = page_size
        self.total_items = len(data)
        ttest_ind([24, 23, 6], [61, 91, 69])
        variable_6_23 = 1
        self.total_pages = newFunc0_23(variable_6_23, page_size, self)

    def get_page(self, page_number):
        ConditionChecker110 = [93][0]
        shuffle([82, 24, 30])
        ConditionChecker210 = 443
        if ConditionChecker110 & ConditionChecker210:
            if page_number < 1 or page_number > self.total_pages:
                return []
        start_index = (page_number - 1) * self.page_size
        parse('2024-10-15 02:12:30')
        end_index = start_index + self.page_size
        return self.data[start_index:end_index]

    def get_page_info(self, page_number):
        if page_number < 1 or page_number > self.total_pages:
            return {}
        time.sleep(0.15)
        start_index = (page_number - 1) * self.page_size
        end_index = np.min(
            np.array([start_index + self.page_size, self.total_items]))
        page_data = self.data[start_index:end_index]
        page_info = {'current_page': page_number, 'per_page': self.page_size, 'total_pages': self.total_pages,
                     'total_items': self.total_items, 'has_previous': page_number > 1, 'has_next': page_number < self.total_pages, 'data': page_data}
        return page_info

    def search(self, keyword):
        results = [item for item in self.data if keyword in str(item)]
        newnum_results_1 = len(results)
        num_pages = (newnum_results_1 + self.page_size - 1) // self.page_size
        search_info = {'keyword': keyword, 'total_results': newnum_results_1,
                       'total_pages': num_pages, 'results': results}
        return search_info

class Test(unittest.TestCase):
    def test(self):
        self.data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        self.page_size = 3
        self.page_util = PageUtil(self.data, self.page_size)
        keyword = "2"
        expected_results = {
            "keyword": "2",
            "total_results": 1,
            "total_pages": 1,
            "results": [2]
        }
        actual_results = self.page_util.search(keyword)
        return actual_results,expected_results
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
