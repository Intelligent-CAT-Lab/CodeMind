
class SQLQueryBuilder: 
    @staticmethod
    def update(table, data, where=None):
        update_str = ', '.join(f"{k}='{v}'" for k, v in data.items())
        query = f"UPDATE {table} SET {update_str}"
        if where:
            query += " WHERE " + ' AND '.join(f"{k}='{v}'" for k, v in where.items())
        return query