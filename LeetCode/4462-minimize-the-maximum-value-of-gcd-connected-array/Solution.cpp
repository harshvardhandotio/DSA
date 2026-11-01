class Solution {
public:
    long long minimumMaxValue(int n, int index, int value) {
        if(n==1){
            return value;
        }
        if(value==1){
            return -1;
        }
        
        long long p=value;
        for(long long i=2;i*i<=value;i++){
            if(value%i==0){
                p=i;
                break;
            }
        }
        long long maxleft=(value-p)/2;
        if(index>maxleft){
            return -1;
        }
        long long rightcount=n-index-1;
        if(rightcount==0){
            return value;
        }
        long long ans;
        if(value%2==0){
            ans=value+2LL*rightcount;
        }
        else{
            ans=value+p+2LL*(rightcount-1);
        }
        return ans;
        
    }
};