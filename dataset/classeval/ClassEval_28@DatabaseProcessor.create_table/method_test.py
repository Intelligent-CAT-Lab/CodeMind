def test(self):
        self.database_name = "test.db"
        self.processor = DatabaseProcessor(self.database_name)
        table_name = "test_table4"
        self.processor.create_table(table_name, 'name', 'age')

        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()
        cursor.execute("SELECT name FROM sqlite_master WHERE type='table' AND name=?", (table_name,))
        result = cursor.fetchone()
        conn.close()

        return result,result[0],table_name