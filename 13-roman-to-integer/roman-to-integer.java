class Solution {
    private String S;
    private int n;

    private char getNext(int i) {
        if(!(i+1 < n))
            return 0;
        
        return S.charAt(i+1);
    }

    public int romanToInt(String s) {
        S = s;
        n = s.length();
        int sum = 0;

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            char next;

            switch(c) {
                case 'I':
                    next = getNext(i);
                    if(next == 'V'){
                        sum += 4;
                        i++;
                    }
                    else if(next == 'X'){
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }

                    break;
                case 'V':
                    sum += 5;

                    break;
                case 'X':
                    next = getNext(i);
                    if(next == 'L'){
                        sum += 40;
                        i++;
                    }
                    else if(next == 'C'){
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }
                    
                    break;
                case 'L':
                    sum += 50;

                    break;
                case 'C':
                    next = getNext(i);
                    if(next == 'D'){
                        sum += 400;
                        i++;
                    }
                    else if(next == 'M'){
                        sum += 900;
                        i++;
                    } else {
                        sum += 100;
                    }
                    
                    break;
                case 'D':
                    sum += 500;

                    break;
                case 'M':
                    sum += 1_000;

                    break;
            }
        }

        return sum;
    }
}