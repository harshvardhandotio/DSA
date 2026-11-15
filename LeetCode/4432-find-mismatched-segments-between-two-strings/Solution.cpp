class Solution {
public:
    vector<vector<string>> findMismatchedSegments(string s1, string s2) {
        vector<vector<string>> ans;
        int i=0;
        int n=s1.length();
        while(i<n){
            if(s1[i]==s2[i]){
                i++;
                continue;
            }
            string a="";
            string b="";
            while(i<n && s1[i]!=s2[i]){
                a+=s1[i];
                b+=s2[i];
                i++;
            }
            ans.push_back({a,b});
        }
        return ans;
    }
};