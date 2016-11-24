package com.springapp.lib;

import java.util.List;
import com.hibernateapp.lib.Person;

/**
 * Created by anudeepreddy0555 on 11/24/2016.
 */
public interface PersonDAO {

    public void save(Person p);

    public List<Person> list();

}