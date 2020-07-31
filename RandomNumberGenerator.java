package com.java.GQuiz;


import java.util.Random;

class RandomNumberGenerator {

    static int Random(int high_random) {
        // create instance of Random class
        Random rand = new Random();
        // Generate random integers in range 0 to t (input)
        return rand.nextInt(high_random);
    }
}
