class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        
        char[] arr = magazine.toCharArray();
        
        for(int i = 0; i < ransomNote.length(); i++){
            boolean found = false;
            
            for(int j = 0; j < arr.length; j++){
                if(ransomNote.charAt(i) == arr[j]){
                    arr[j] = '#';
                    found = true;
                    break;
                }
            }
            
            if(!found){
                return false;
            }
        }
        
        return true;
    }
}
