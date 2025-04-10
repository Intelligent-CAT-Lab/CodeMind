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