package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Тест-класс для класса Machine.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 7.05.2020.
 */
public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by32() {
        Machine machine = new Machine();
        int[] expected = {10, 5, 2, 1};
        int[] rsl = machine.change(50, 32);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by40() {
        Machine machine = new Machine();
        int[] expected = {10};
        int[] rsl = machine.change(50, 40);
        assertThat(rsl, is(expected));
    }

}