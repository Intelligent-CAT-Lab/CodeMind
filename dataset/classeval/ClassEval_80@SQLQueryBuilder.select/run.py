import os
import unittest
class SQLQueryBuilder:

    @staticmethod
    def select(table, columns='*', where=None):
        if columns != '*':
            columns = ', '.join(columns)
        query = f"SELECT {columns} FROM {table}"
        if where:
            query += " WHERE " + ' AND '.join(f"{k}='{v}'" for k, v in where.items())
        return query

    @staticmethod
    def insert(table, data):
        keys = ', '.join(data.keys())
        values = ', '.join(f"'{v}'" for v in data.values())
        return f"INSERT INTO {table} ({keys}) VALUES ({values})"

    @staticmethod
    def delete(table, where=None):
        query = f"DELETE FROM {table}"
        if where:
            query += " WHERE " + ' AND '.join(f"{k}='{v}'" for k, v in where.items())
        return query

    @staticmethod
    def update(table, data, where=None):
        update_str = ', '.join(f"{k}='{v}'" for k, v in data.items())
        query = f"UPDATE {table} SET {update_str}"
        if where:
            query += " WHERE " + ' AND '.join(f"{k}='{v}'" for k, v in where.items())
        return query
class Test(unittest.TestCase):
    def test(self):
            return SQLQueryBuilder.select('students', ['id', 'name'], {'age': 18})
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_80@SQLQueryBuilder.select/output.txt', 'w') as wr:
    wr.write(str(a))
        