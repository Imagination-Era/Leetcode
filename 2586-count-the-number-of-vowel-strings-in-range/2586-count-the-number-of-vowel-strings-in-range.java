class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i=left;i<=right;i++){
            String k=words[i];
            if(vowels.contains(k.charAt(0)) && vowels.contains(k.charAt(k.length() - 1)))
                count++;
            }
            return count;
        }
}
        
  