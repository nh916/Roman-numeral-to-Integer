class Solution {
    public int romanToInt(String s) {
        
        HashMap <Character, Integer> romanDict = new HashMap<Character, Integer>();
        
        int result = 0;
        
        romanDict.put('I', 1);
        romanDict.put('V', 5);
        romanDict.put('X', 10);
        romanDict.put('L', 50);
        romanDict.put('C', 100);
        romanDict.put('D', 500);
        romanDict.put('M', 1000);
        
        for (int i = 0; i < s.length() - 1; i++) {
            
                
       // if the next number is bigger than the previous then subtract that number from total
            if ((romanDict.get(s.charAt(i + 1)) > (romanDict.get(s.charAt(i)))) ) {
                result-= romanDict.get(s.charAt(i));
            } 
            else {
                result += romanDict.get(s.charAt(i));
            }
        }
    
        result += romanDict.get(s.charAt(s.length() - 1));

        return result;
    }
}
