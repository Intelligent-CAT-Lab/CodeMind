dp[i] = 0;
for(int j=1;j<10;++j){
    dp[i] = Math.min(dp[i],dp[i*10+j]);
}