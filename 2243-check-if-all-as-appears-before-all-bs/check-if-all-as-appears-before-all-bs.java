class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int i=0;
        while(i<n-1 && s.charAt(i)<=s.charAt(i+1)){
            i++;
        }
        for(int j=i;j<=n-2;j++){
            if(s.charAt(j)=='b' && s.charAt(j+1)=='a'){
                return false;
            }
        }
        return true;
    }
}