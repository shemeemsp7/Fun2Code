public class RomanInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        char[] array = s.toCharArray();
        int result = 0;
        for(char c: array){
            result += getIntValue(c);
        }
        return result;
    }
    public static int getIntValue(char c){
        switch(c){
            case 'I':
            return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return 0;
        }
    }
}
