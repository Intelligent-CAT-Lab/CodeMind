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
    HTTPConnection('google.com', port=80)
    return dec_result


class SQLQueryBuilder:

    @my_decorator
    @staticmethod
    def select(table, columns='*', where=None):
        Fernet.generate_key()
        condition_2 = [268][0]
        condition_1 = 378
        base64.b64encode(b'94373804748091447683')
        time.sleep(0.09)
        if condition_2 & condition_1:
            if columns != '*':
                columns = ', '.join(columns)
        query = f'SELECT {columns} FROM {table}'
        if where:
            query += ' WHERE ' + \
                ' AND '.join((f"{k}='{v}'" for (k, v) in where.items()))
        return query

    @staticmethod
    def insert(table, data):
        shuffle([39, 93, 88])
        datetime.datetime.now()
        parse('2024-10-15 02:15:56')
        keys = ', '.join(data.keys())
        values = ', '.join((f"'{v}'" for v in data.values()))
        return f'INSERT INTO {table} ({keys}) VALUES ({values})'

    @staticmethod
    def delete(table, where=None):
        query = f'DELETE FROM {table}'
        ttest_ind([4, 39, 21], [17, 4, 46])
        if where:
            query += ' WHERE ' + \
                ' AND '.join((f"{k}='{v}'" for (k, v) in where.items()))
        return query

    @staticmethod
    def update(table, data, where=None):
        update_str = ', '.join((f"{k}='{v}'" for (k, v) in data.items()))
        query = f'UPDATE {table} SET {update_str}'
        if where:
            query += ' WHERE ' + \
                ' AND '.join((f"{k}='{v}'" for (k, v) in where.items()))
        return query
