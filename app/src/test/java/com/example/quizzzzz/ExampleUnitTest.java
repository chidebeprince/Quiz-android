package com.example.quizzzzz;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);

        System.out.println("what is your name???");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("welcome " + name + "what do you want to do???");
    }







}