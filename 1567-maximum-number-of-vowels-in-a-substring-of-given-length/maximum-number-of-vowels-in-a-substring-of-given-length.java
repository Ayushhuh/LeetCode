class Solution {
    public int maxVowels(String s, int k) {
        int mv = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            char r = s.charAt(i);

            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
                count++;
            }
        }

        mv = count;

        int lp = 0;
        int rp = k;

        while (rp < s.length()) {

            if (s.charAt(lp) == 'a' || s.charAt(lp) == 'e' ||
                s.charAt(lp) == 'i' || s.charAt(lp) == 'o' ||
                s.charAt(lp) == 'u') {
                count--;
            }

            if (s.charAt(rp) == 'a' || s.charAt(rp) == 'e' ||
                s.charAt(rp) == 'i' || s.charAt(rp) == 'o' ||
                s.charAt(rp) == 'u') {
                count++;
            }

            if (count > mv) {
                mv = count;
            }

            lp++;
            rp++;
        }

        return mv;
    }
}