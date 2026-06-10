class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int thousands = num / 1_000;
        int hundreds = (num % 1000) / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        // 천의 자리
        for(int i=0; i<thousands; i++) {
            sb.append("M");
        }

        // 백의 자리
        switch(hundreds) {
            case 1:
            case 2:
            case 3:
                for(int i=0; i<hundreds; i++)
                    sb.append("C");
                break;
            case 4:
                sb.append("CD");
                break;
            case 5:
                sb.append("D");
                break;
            case 6:
            case 7:
            case 8:
                sb.append("D");
                for(int i=0; i<hundreds - 5; i++)
                    sb.append("C");
                break;
            case 9:
                sb.append("CM");
                break;
        }

        // 십의 자리
        switch(tens) {
            case 1:
            case 2:
            case 3:
                for(int i=0; i<tens; i++)
                    sb.append("X");
                break;
            case 4:
                sb.append("XL");
                break;
            case 5:
                sb.append("L");
                break;
            case 6:
            case 7:
            case 8:
                sb.append("L");
                for(int i=0; i<tens - 5; i++)
                    sb.append("X");
                break;
            case 9:
                sb.append("XC");
                break;
        }

        // 일의 자리
        switch(ones) {
            case 1:
            case 2:
            case 3:
                for(int i=0; i<ones; i++)
                    sb.append("I");
                break;
            case 4:
                sb.append("IV");
                break;
            case 5:
                sb.append("V");
                break;
            case 6:
            case 7:
            case 8:
                sb.append("V");
                for(int i=0; i<ones - 5; i++)
                    sb.append("I");
                break;
            case 9:
                sb.append("IX");
                break;
        }
        


        return sb.toString();
    }
}