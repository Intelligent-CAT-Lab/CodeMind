import unittest
import sqlite3
import pandas as pd


class DatabaseProcessor:

    def __init__(self, database_name):
        self.database_name = database_name

    def create_table(self, table_name, key1, key2):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        create_table_query = f"CREATE TABLE IF NOT EXISTS {table_name} (id INTEGER PRIMARY KEY, {key1} TEXT, {key2} INTEGER)"
        cursor.execute(create_table_query)

        conn.commit()
        conn.close()

    def insert_into_database(self, table_name, data):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        for item in data:
            insert_query = f"INSERT INTO {table_name} (name, age) VALUES (?, ?)"
            cursor.execute(insert_query, (item['name'], item['age']))

        conn.commit()
        conn.close()

    def search_database(self, table_name, name):

        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        select_query = f"SELECT * FROM {table_name} WHERE name = ?"
        cursor.execute(select_query, (name,))
        result = cursor.fetchall()

        if result:
            return result
        else:
            return None

    def delete_from_database(self, table_name, name):

        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        delete_query = f"DELETE FROM {table_name} WHERE name = ?"
        cursor.execute(delete_query, (name,))

        conn.commit()
        conn.close()
class Test(unittest.TestCase):
    def test(self):
            self.database_name = "test.db"
            self.processor = DatabaseProcessor(self.database_name)
            table_name = "test_table"
            data = [
                {'name': 'bbb', 'age': 25},
                {'name': 'Alice', 'age': 30}
            ]
            self.processor.create_table(table_name, 'name', 'age')
            self.processor.insert_into_database(table_name, data)
            self.processor.delete_from_database(table_name, 'bbb')
            conn = sqlite3.connect(self.database_name)
            cursor = conn.cursor()
            cursor.execute(f"SELECT * FROM {table_name}")
            result = cursor.fetchall()
            conn.close()
            return len(result),result[0][1]