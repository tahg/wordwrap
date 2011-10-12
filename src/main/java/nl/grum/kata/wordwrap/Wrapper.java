package nl.grum.kata.wordwrap;

public class Wrapper {

    /**
     * Wrap the input string
     * @param input
     * @return
     */
    public static String wrap(String input, int column) {
        if (input.length() <= column)
            return input;
        else {
            return input.substring(0,column) + "\n" + input.substring(column);
        }
    }
}
