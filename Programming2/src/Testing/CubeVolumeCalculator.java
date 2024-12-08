package Testing;

public class CubeVolumeCalculator {

    public static double calculateCubeVolume(double sideLength) throws IllegalArgumentException {
        if (sideLength <= 0 || sideLength >= 50) {
            throw new IllegalArgumentException("Side length must be greater than 0 and less than 50.");
        }
        // Calculate and return the volume
        return Math.pow(sideLength, 3);
    }

    public static void main(String[] args) {
        try {
            double sideLength = 10;
            double volume = calculateCubeVolume(sideLength);
            System.out.println("The volume of the cube is: " + volume);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    
}