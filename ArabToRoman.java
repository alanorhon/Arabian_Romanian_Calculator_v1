import java.util.LinkedHashMap;
import java.util.Map;

        // Класс конвертирующий арабские цифры в римские

class ArabToRoman {
    static String RomanNumerals(int Int) {

        LinkedHashMap<String, Integer> roman = new LinkedHashMap<String, Integer>();
        roman.put("M", 1000);
        roman.put("CM", 900);
        roman.put("D", 500);
        roman.put("CD", 400);
        roman.put("C", 100);
        roman.put("XC", 90);
        roman.put("L", 50);
        roman.put("XL", 40);
        roman.put("X", 10);
        roman.put("IX", 9);
        roman.put("V", 5);
        roman.put("IV", 4);
        roman.put("I", 1);
        StringBuilder res = new StringBuilder();

        for(Map.Entry<String, Integer> entry : roman.entrySet()){
            int matches = Int/entry.getValue();
            res.append(repeat(entry.getKey(), matches));
            Int = Int % entry.getValue();
        }
        return res.toString();
    }
    private static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s.repeat(Math.max(0, n)));
        return sb.toString();
    }
}
