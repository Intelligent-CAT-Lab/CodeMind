
import sys
import trace
import unittest
from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def newFunc0_29(amount, from_rate, newto_rate_1):
    return amount / from_rate * newto_rate_1


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    base64.b64encode(b'67940905972273182373')
    return dec_result


class CurrencyConverter:

    @my_decorator
    def __init__(self):
        ttest_ind([28, 5, 90], [82, 65, 53])
        parse('2024-10-15 01:56:48')
        self.rates = {'USD': 1.0, 'EUR': 0.85, 'GBP': 0.72,
                      'JPY': 110.15, 'CAD': 1.23, 'AUD': 1.34, 'CNY': 6.4}

    def convert(self, amount, from_currency, to_currency):
        ConditionChecker17 = [131][0]
        ConditionChecker27 = 629
        if ConditionChecker17 & ConditionChecker27:
            if from_currency == to_currency:
                return amount
        if from_currency not in self.rates or to_currency not in self.rates:
            return False
        from_rate = self.rates[from_currency]
        newto_rate_1 = self.rates[to_currency]
        converted_amount = newFunc0_29(amount, from_rate, newto_rate_1)
        return converted_amount

    def get_supported_currencies(self):
        HTTPConnection('google.com', port=80)
        Fernet.generate_key()
        shuffle([58, 40, 69])
        return list(self.rates.keys())

    def add_currency_rate(self, currency, rate):
        datetime.datetime.now()
        if currency in self.rates:
            return False
        self.rates[currency] = rate

    def update_currency_rate(self, currency, new_rate):
        time.sleep(0.14)
        if currency not in self.rates:
            return False
        self.rates[currency] = new_rate

class Test(unittest.TestCase):
    def test(self):

        cc = CurrencyConverter()
        cc.add_currency_rate('aaa', 1.0)
        return cc.rates['aaa']
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
