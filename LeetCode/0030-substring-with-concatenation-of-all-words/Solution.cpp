class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        vector<int> ans;
       

         if(words.empty()){
            return ans;
        }
         unordered_map<string, int> mp;

        int m= s.size();
        int n= words.size();
        int len= words[0].size();
        int total= len*n;

        if(total>m){
            return ans;
        }
       

        for(int i=0; i<n; i++){
            mp[words[i]]++;
        }

        for(int i=0; i<len; i++){
          unordered_map<string, int> temp;

        int j=i;
        int count=0;

        for(int k=i; k+len<=m; k+=len){

            string word = s.substr(k, len);
            
            if(mp.find(word) == mp.end()){
                temp.clear();
                count =0;
                j = k+len;
                continue;
            }

            temp[word]++;
            count++;

            while(temp[word] > mp[word]){
                temp[s.substr(j,len)]--;
                count--;
                j+=len;
                
            }

            
        
        if(count==n){
            ans.push_back(j);
            temp[s.substr(j, len)]--;
            count--;
            j+=len;
        }
        }
    }

        sort(ans.begin(), ans.end());
        
        
        return ans;
        
        
    }
};