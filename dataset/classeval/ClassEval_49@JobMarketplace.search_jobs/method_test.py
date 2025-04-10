def test(self):

        jobMarketplace = JobMarketplace()
        jobMarketplace.job_listings = [{"job_title": "Software Engineer", "company": "ABC Company", "requirements": ['skill1', 'skill2']}, {"job_title": "Software Engineer", "company": "ABC Company", "requirements": ['skill3', 'skill4']}]
        return jobMarketplace.search_jobs('skill6')