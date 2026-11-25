class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long count=0;
        int sum=skill[0]+skill[n-1];
        int i=0;
        int j=n-1;
        while(i<j){
            if(skill[i]+skill[j]!=sum){
                return -1;
            }
            count=count+(long) skill[i]*skill[j];
            i++;
            j--;
        }
        return count;

        
    }
}