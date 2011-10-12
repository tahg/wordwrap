package nl.grum.kata.wordwrap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WrapperTest {

    @Test
    public void inputShorterThanColReturnAsIs() {
        String subject = Wrapper.wrap("test", 10);

        assertThat(subject, is("test"));
    }

    @Test
    public void inputLongerThanColReturnsWrappedString() {
        String subject = Wrapper.wrap("foobar", 3);
        assertThat(subject, is("foo\nbar"));
    }
}
