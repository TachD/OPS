package edu.BarSU.Variants.V5;

/**
 * Created by Govor Alexander on 22.03.2017.
 */
public class Data {
    public static double func(double X1, double X2) {
        return 0.5 * Math.pow(X2, 2) + 0.5 * Math.pow(X1, 2) - X1 - 2 * X2 + 5;
    }

    public static boolean isOptimal(double X1, double X2) {
        if (!(X1 >= 0 && X2 >= 0))
            return false;

        if (!(2 * X1 + 3 * X2 >= 6))
            return false;

        if (!(X1 + 4 * X2 >= 5))
            return false;

        return  true;
    }
}
