
class SQLQueryBuilder: 
    @staticmethod
    def insert(table, data):
        keys = ', '.join(data.keys())
        values = ', '.join(f"'{v}'" for v in data.values())
        return f"INSERT INTO {table} ({keys}) VALUES ({values})"