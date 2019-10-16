package labs;

import java.io.IOException;

public class AreaCalculator {
    public int calculateRectangle(int length, int height) {
        if (length < 0) {
            throw new IllegalArgumentException("Length should be a positive number");
        }
        else if (height < 0) {
            throw new IllegalArgumentException("Height should be a positive number");
        }
        else {
            return length * height;
        }
    }
}

