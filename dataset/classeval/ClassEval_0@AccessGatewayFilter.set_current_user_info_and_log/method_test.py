def test(self):

        agf = AccessGatewayFilter()
        request = {'path': '/api/data', 'method': 'GET'}
        res = agf.filter(request)

        request_uri = '/api/data'
        res = agf.is_start_with(request_uri)

        request = {
            'headers': {'Authorization': {'user': {'name': 'user1'}, 'jwt': 'user1' + str(datetime.date.today())}}}
        res = agf.get_jwt_user(request)
        return res,res,res