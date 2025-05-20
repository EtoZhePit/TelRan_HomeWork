package telran.equation.controller;

import telran.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation eq = new QuadraticEquation(2,-4,-6);
        eq.display();
        System.out.println("Delta = " + eq.delta());
        System.out.println("Number of roots = " + eq.quantityRoots());

        double[] roots = eq.getRoots();
        for (int i = 0; i < roots.length ; i++) {
            System.out.println("Root[" + (i+1) + "] = " + roots[i]);

            
        }

    }
}
