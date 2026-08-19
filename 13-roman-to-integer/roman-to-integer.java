class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> rom = new HashMap<>();
        rom.put('I', 1);
        rom.put('V', 5);
        rom.put('X', 10);
        rom.put('L', 50);
        rom.put('C', 100);
        rom.put('D', 500);
        rom.put('M', 1000);
        int sum = 0;
        for (int i = s.length()-1; i >= 0; i--) {

            if (i==0)
            {
                sum += rom.get(s.charAt(i));
            }
            else if (rom.get(s.charAt(i)).compareTo(rom.get(s.charAt(i-1)))>0)
            {
                sum += rom.get(s.charAt(i));
                sum -= rom.get(s.charAt(i-1));
                i--;
            }

            else
            {
                sum += rom.get(s.charAt(i));
            }
        }
        return sum;
    }
}