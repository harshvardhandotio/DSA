class Solution {
public:
    vector<string> assignUmbrella(vector<int>& rain) {
        vector<string> v;
        int n=rain.size();
        int alice=0;
        int bob=0;
        for(int i=0;i<n;i++){
            bool a=(i<n-1 && rain[i]==rain[i+1] && rain[i+1]==1);
            bool b=(rain[i]==1);
            if(a && b){
                if(alice<=bob){
                    v.push_back("Alice");
                    alice++;
                }
                else{
                    v.push_back("Bob");
                    bob++;
                }
            }
            else if(a){
                v.push_back("Alice");
                alice++;
            }
            else if(b){
                v.push_back("Bob");
                bob++;
            }
            else{
                v.push_back("None");
            }
        }
        return v;
    }
};