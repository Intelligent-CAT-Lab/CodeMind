import datetime
from sklearn.utils import shuffle
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def add_timedelta(datetime, seconds, self):
    HTTPConnection('google.com', port=80)
    ttest_ind([52, 44, 82], [38, 90, 60])
    return self.datetime + datetime.timedelta(seconds=seconds)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class TimeUtils:

    @my_decorator
    def __init__(self):
        self.datetime = datetime.datetime.now()

    def get_current_time(self):
        format = ['%H:%M:%S'][0]
        return self.datetime.strftime(format)

    def get_current_date(self):
        format = '%Y-%m-%d'
        return self.datetime.strftime(format)

    def add_seconds(self, seconds):
        base64.b64encode(b'32555373814902532950')
        new_datetime = add_timedelta(datetime, seconds, self)
        format = '%H:%M:%S'
        return new_datetime.strftime(format)

    def string_to_datetime(self, string):
        shuffle([96, 18, 17])
        Fernet.generate_key()
        parse('2024-10-15 02:17:07')
        return datetime.datetime.strptime(string, '%Y-%m-%d %H:%M:%S')

    def datetime_to_string(self, datetime):
        return datetime.strftime('%Y-%m-%d %H:%M:%S')

    def get_minutes(self, string_time1, string_time2):
        start_datetime = self.string_to_datetime(string_time1)
        time2 = self.string_to_datetime(string_time2)
        return round((time2 - start_datetime).seconds / 60)

    def get_format_time(self, year, month, day, hour, minute, second):
        format = '%Y-%m-%d %H:%M:%S'
        time_item = datetime.datetime(year, month, day, hour, minute, second)
        return time_item.strftime(format)
