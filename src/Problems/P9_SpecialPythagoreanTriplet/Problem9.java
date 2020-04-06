package Problems.P9_SpecialPythagoreanTriplet;

import java.text.DecimalFormat;

//Question
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
public class Problem9 {

    public static void main(String[] args) {
        double result = getProduct();
        DecimalFormat decimalFormat = new DecimalFormat("#");
        decimalFormat.setMaximumFractionDigits(8);
        System.out.println("Product: " + decimalFormat.format(result));
    }

    private static double getProduct() {
        for (int b = 2; b < 1000; b++) {
            for (int a = 1; a < b; a++) {
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if (a + b + c == 1000) {
                    return a*b*c;
                }
            }
        }
        return Double.NaN;
    }

}
