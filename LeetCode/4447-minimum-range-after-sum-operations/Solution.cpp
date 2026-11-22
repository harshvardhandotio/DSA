class Solution {
public:
    int minRange(int a, int b, int c) {
        // O(1) approach
        int mini0=max({a,b,c})-min({a,b,c});
        if(a>=b && a>=c){
            a=b+c;
        }
        else if(b>=a && b>=c){
            b=a+c;
        }
        else{
            c=a+b;
        }
        int mini1=max({a,b,c})-min({a,b,c});
        return min(mini0,mini1);
        // O(nlogn) approach
        // vector<int> v={a,b,c};
        // sort(v.begin(),v.end());
        // return min(v[2]-v[0],v[1]);
        
    }
};