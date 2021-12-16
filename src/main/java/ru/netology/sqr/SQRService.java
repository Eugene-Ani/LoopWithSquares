package ru.netology.sqr;

public class SQRService {
    public int calculate(int leftBorder, int rightBorder) {

        int count = 0;
        for (int i = 0; i <= 99; i++) {
            if (leftBorder <= i * i && i * i <= rightBorder) {
                count++;
            }
        }
        return count;
    }
}
