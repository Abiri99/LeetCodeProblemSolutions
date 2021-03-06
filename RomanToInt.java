public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println("result " + String.valueOf(romanToInt.romanToInt("MCMXCIV")));
    }

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            switch (currentChar) {
                case 'I':
                    if (s.charAt(i + 1) == 'V') {
                        result += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                case 'X':
                    if (s.charAt(i + 1) == 'L') {
                        result += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        result += 90;
                        i++;
                    } else {
                        result += 50;
                    }
                    break;
                case 'C':
                    if (s.charAt(i + 1) == 'D') {
                        result += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                    break;
            }
        }

        return result;
    }
}
