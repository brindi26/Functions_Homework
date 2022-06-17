package FunctionsHomework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative[] saleReps = new SalesRepresentative[3];

        saleReps[0] = new SalesRepresentative("Stefan", 573,34.6);
        saleReps[1] = new SalesRepresentative("Brindi" , 623,23.2);
        saleReps[2] = new SalesRepresentative("Alex",2335,75.3);

        System.out.println("Initial array: " + Arrays.toString(saleReps));
        BubbleSortAlgorithm.sort(saleReps);
        System.out.println("Final array: " + Arrays.toString(saleReps));







    }
}
