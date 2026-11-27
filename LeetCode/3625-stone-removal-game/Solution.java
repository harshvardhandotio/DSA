class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int num=10;
        while(n>=num){
            n=n-num;
            num--;
            if(n<num){
                return true;
            }
                n=n-num;
                num--;
            
        }
        return false;
        
    }
}