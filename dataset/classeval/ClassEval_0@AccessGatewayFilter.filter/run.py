import os
import unittest
import logging
import datetime


class AccessGatewayFilter:

    def __init__(self):
        pass

    def filter(self, request):
        request_uri = request['path']
        method = request['method']

        if self.is_start_with(request_uri):
            return True

        try:
            token = self.get_jwt_user(request)
            user = token['user']
            if user['level'] > 2:
                self.set_current_user_info_and_log(user)
                return True
        except:
            return False

    def is_start_with(self, request_uri):
        start_with = ["/api", '/login']
        for s in start_with:
            if request_uri.startswith(s):
                return True
        return False

    def get_jwt_user(self, request):
        token = request['headers']['Authorization']
        user = token['user']
        if token['jwt'].startswith(user['name']):
            jwt_str_date = token['jwt'].split(user['name'])[1]
            jwt_date = datetime.datetime.strptime(jwt_str_date, "%Y-%m-%d")
            if datetime.datetime.today() - jwt_date >= datetime.timedelta(days=3):
                return None
        return token

    def set_current_user_info_and_log(self, user):
        host = user['address']
        logging.log(msg=user['name'] + host + str(datetime.datetime.now()), level=1)
class Test(unittest.TestCase):
    def test(self):
            agf = AccessGatewayFilter()
            request = {'path': '/abc', 'method': 'POST',
                       'headers': {
                           'Authorization': {'user': {'name': 'user1', 'level': 5, 'address': 'address1'},
                                             'jwt': 'user1' + str(datetime.date.today())}}}
            res = agf.filter(request)
            return res
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_0@AccessGatewayFilter.filter/output.txt', 'w') as wr:
    wr.write(str(a))
        