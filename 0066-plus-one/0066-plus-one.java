import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger num = BigInteger.ZERO;

        for (int i = 0; i < digits.length; i++) {
            num = num.multiply(BigInteger.TEN)
                     .add(BigInteger.valueOf(digits[i]));
        }

        num = num.add(BigInteger.ONE);

        String str = num.toString();
        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i) - '0';
        }

        return result;
    }
}