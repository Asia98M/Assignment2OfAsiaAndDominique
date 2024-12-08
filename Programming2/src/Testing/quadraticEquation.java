package Testing;

public class quadraticEquation {

    public static double[] findRoots(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero.");
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            throw new IllegalArgumentException("No real roots exist for the given equation.");
        }
        
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        return discriminant == 0 ? new double[]{root1, root1} : new double[]{root1, root2};
    }
    
}
