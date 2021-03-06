package com.javakoan.lesson.java.generics;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 12/11/13
 * Time: 09:04
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class TypeErasure {

    /**
     * Mediate on how to access elements of a gerericized type
     */
    @Koan
    public void reflectOnAccessingAGenericizedType(){
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        String firstElement = null;
        String secondElement = null;
        String thirdElement = null;

        // (@_@)

        // (^_^)

        assertThat(firstElement, is("A"));
        assertThat(secondElement, is("B"));
        assertThat(thirdElement, is("C"));
    }

    /**
     * Mediate on how to access elements of a non gerericized type and how it is represented at runtime
     */
    @Koan
    public void reflectOnWhatTheAboveCodeCompilesAs(){
        List strings = new ArrayList();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        String firstElement = null;
        String secondElement = null;
        String thirdElement = null;

        // (@_@)

        // (^_^)

        assertThat(firstElement, is("A"));
        assertThat(secondElement, is("B"));
        assertThat(thirdElement, is("C"));
    }

}
