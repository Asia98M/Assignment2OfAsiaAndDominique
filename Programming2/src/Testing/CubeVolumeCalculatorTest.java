package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CubeVolumeCalculatorTest {

    @Test
    public void testValidSideLength() {
        // Test with a valid side length
        double sideLength = 10;
        double expectedVolume = 1000; // 10^3 = 1000
        assertEquals(expectedVolume, CubeVolumeCalculator.calculateCubeVolume(sideLength),
                "Volume should be calculated correctly for a valid side length.");
    }

    @Test
    public void testSideLengthZero() {
        // Test with a side length of 0, which should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            CubeVolumeCalculator.calculateCubeVolume(0);
        }, "An exception should be thrown for a side length of 0.");
    }

    @Test
    public void testSideLengthGreaterThanAllowed() {
        // Test with a side length greater than 50, which should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            CubeVolumeCalculator.calculateCubeVolume(50);
        }, "An exception should be thrown for a side length >= 50.");
    }

    @Test
    public void testNegativeSideLength() {
        // Test with a negative side length, which should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            CubeVolumeCalculator.calculateCubeVolume(-5);
        }, "An exception should be thrown for a negative side length.");
    }
}