package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int currentHeight = 0;
        int jumps = 0;
        while (currentHeight != flagHeight) {
            currentHeight += jumpHeight;
            if (currentHeight > flagHeight) {
                currentHeight -= jumpHeight;
                currentHeight++;
            }
            jumps++;
        }
        return jumps;
    }
}
