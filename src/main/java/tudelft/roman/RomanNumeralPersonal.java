package tudelft.roman;

import java.util.HashMap;

public class RomanNumeralPersonal {

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }


    public int converter(String roman){
        int result = 0;

        for(int i = 0; i < roman.length(); i++){
            int currentNumber = map.get(roman.toCharArray()[i]);
            int next = i+1 < s.length() ? map.get(roman.charAt(i+1)) : 0;

            if(currentNumber >= next) {
                result += currentNumber;
            }else {
                result -= currentNumber;
            }
        }

        return result;
    }
}
