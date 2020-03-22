package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *МaxTest.
 *
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 22.03.2020.
 */

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2Then() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To3Then() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To4Then() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }


}