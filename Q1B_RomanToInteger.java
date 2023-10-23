public class Q1B_RomanToInteger{
    public static void main(String[] args) {
        String romanNum = "XIV"; 
        int result = romanToInteger(romanNum);
        System.out.println("Integer value of " + romanNum + " is: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int crntVal;

            switch (currentChar) {
                case 'I':
                    crntVal = 1;
                    break;
                case 'V':
                    crntVal = 5;
                    break;
                case 'X':
                    crntVal = 10;
                    break;
                case 'L':
                    crntVal = 50;
                    break;
                case 'C':
                    crntVal = 100;
                    break;
                case 'D':
                    crntVal = 500;
                    break;
                case 'M':
                    crntVal = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral character: " + currentChar);
            }

            if (crntVal < prevVal) {
                result -= crntVal;
            } else {
                result += crntVal;
            }

            prevVal = crntVal;
        }

        return result;
    }
}
