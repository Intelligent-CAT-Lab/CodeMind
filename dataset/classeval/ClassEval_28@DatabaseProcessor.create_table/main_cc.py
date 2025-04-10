import sqlite3
import pandas as pd
class DatabaseProcessor: 
    def __init__(self, database_name):
        """
        Initialize database name of database processor
        """
        self.database_name = database_name


    def create_table(self, table_name, key1, key2):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        create_table_query = f"CREATE TABLE IF NOT EXISTS {table_name} (id INTEGER PRIMARY KEY, {key1} TEXT, {key2} INTEGER)"
        cursor.execute(create_table_query)

        conn.commit()
        conn.close()