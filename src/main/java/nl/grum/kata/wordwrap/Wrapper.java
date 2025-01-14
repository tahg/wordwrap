package nl.grum.kata.wordwrap;

public class Wrapper {

    /**
     * Wrap the input string
     * @param input
     * @return
     */
    public static String wrap(String input, int column) {
        if (input.length() <= column) return input;
        String ret = "";
        int idx = 0;
        for (; idx < input.length() - column; idx += column) {
            while (Character.isWhitespace(input.charAt(idx))) idx++;
            if (idx >= input.length() - column) break;
            ret += input.substring(idx, idx + column) + "\n";
        }
        ret += input.substring(idx);
        return ret;
    }
}
