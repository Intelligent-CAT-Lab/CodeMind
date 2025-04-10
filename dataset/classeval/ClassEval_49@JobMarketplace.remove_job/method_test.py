def test(self):

        jobMarketplace = JobMarketplace()
        jobMarketplace.job_listings = [{"job_title": "Software Engineer", "company": "ABC Company", "requirements": ['requirement1', 'requirement2']}, {"job_title": "Mechanical Engineer", "company": "XYZ Company", "requirements": ['requirement3', 'requirement4']}, {"job_title": "Software Engineer", "company": "ABC Company", "requirements": ['requirement1', 'requirement2']}]
        jobMarketplace.remove_job(jobMarketplace.job_listings[0])
        jobMarketplace.remove_job(jobMarketplace.job_listings[0])
        return jobMarketplace.job_listings