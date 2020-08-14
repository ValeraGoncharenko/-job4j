package ru.job4j.stream;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address = new Address("Sever", "Sverdlova", 340, 9);
        List <Profile> profile = Collections.singletonList(new Profile(address));
        Profiles profiles = new Profiles();
        assertThat(profiles.collect(profile).get(0), is(address));
    }
}