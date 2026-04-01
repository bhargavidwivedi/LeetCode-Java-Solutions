class Solution {
    public String toHex(int num) {

        if(num == 0){
            return "0";
        }

        char[] hexDigit = "0123456789abcdef".toCharArray();
        StringBuilder str = new StringBuilder();

        long n = num;
        if(n < 0){
            n +=(1L << 32);
        }

        while(n > 0){
            int digit = (int)(n%16);
            str.insert(0, hexDigit[digit]);
            n /= 16;
        }
        return str.toString();
    }
}
        