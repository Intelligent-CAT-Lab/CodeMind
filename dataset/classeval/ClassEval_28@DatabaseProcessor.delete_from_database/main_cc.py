import sqlite3
import pandas as pd
class DatabaseProcessor: 
    def __init__(self, database_name):
        """
        Initialize database name of database processor
        """
        self.database_name = database_name


    def delete_from_database(self, table_name, name):

        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        delete_query = f"DELETE FROM {table_name} WHERE name = ?"
        cursor.execute(delete_query, (name,))

        conn.commit()
        conn.close()