package solutions;

/**
 * Created by lvwei on 2/18/2016.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int total = 0;
        String alph = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            int idx = alph.indexOf(c);
            total += idx * Math.pow(26, i);
        }
        return total;
    }
}
