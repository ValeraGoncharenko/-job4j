package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address = new Address("Sever", "Sverdlova", 340, 9);
        List <Profile> profile = Arrays.asList(new Profile(address), new Profile(address));
        Profiles profiles = new Profiles();
        assertThat(profiles.collect(profile).get(0), is(address));
    }

    @Test
    public void collectSort() {
        Address address = new Address("Sever", "Sverdlova", 342, 11);
        Address address1 = new Address("Sever", "Sverdlova", 342, 11);
        Address address2 = new Address("West", "Sverdlova", 340, 9);

        List <Profile> profile = Arrays.asList(new Profile(address1), new Profile(address), new Profile(address2));
        List <Address> ex = Arrays.asList(address1, address2);
        assertThat(new Profiles().collectSortUnique(profile), is(ex));
    }


}