package ss04_excercise_OOP;

import java.util.Scanner;

public class quadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double rootFirst;
    private double rootSecond;
    private double root;


    public quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double a() {
        return a;
    }

    public double b() {
        return b;
    }

    public double c() {
        return c;
    }

    public double getDiscriminant() {
        delta = Math.pow((b), 2) - 4 * a * c;
        return delta;
    }

    public double getRootFirst() {
        rootFirst = ((-b + Math.sqrt(delta)) / 2 * a);
        return rootFirst;
    }

    public double getRootSecond() {
        rootSecond = (((-b - Math.sqrt(delta)) / 2) * a);
        return rootSecond;
    }


    public double getRoot() {
        root = -b / (2 * a);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a :");
        double a;
        a = sc.nextDouble();

        double b;
        System.out.print("Enter b :");
        b = sc.nextDouble();

        double c;
        System.out.print("Enter c :");
        c = sc.nextDouble();

        quadraticEquation BuildLayerQuadraticEquation = new quadraticEquation(a, b, c);
        double delta = BuildLayerQuadraticEquation.getDiscriminant();
        if (delta > 0) {
            double rootFirst = BuildLayerQuadraticEquation.getRootFirst();

            double rootSecond = BuildLayerQuadraticEquation.getRootSecond();
            System.out.println("The equation has two solutions : " + rootFirst + " and " + rootSecond);

        } else if (delta == 0) {
            double root = BuildLayerQuadraticEquation.getRoot();
            System.out.println("The equation has a solution" + root);
        } else {
            System.out.print("The equation has no roots");

        }
    }
}
