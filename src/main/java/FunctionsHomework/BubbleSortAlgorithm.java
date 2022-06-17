package FunctionsHomework;

public class BubbleSortAlgorithm {
    public static void  sort(SalesRepresentative[] saleReps) {

        boolean changedPerformed = true;

            while (changedPerformed){
                changedPerformed = false;

                for (int i = 0; i <saleReps.length-1 ; i++) {

                    if (saleReps[i].getRevenue() < saleReps[i+1].getRevenue()) {

                        SalesRepresentative aux = saleReps[i];
                        saleReps[i] = saleReps[i+1];
                        saleReps[i+1] = aux;
                        changedPerformed = true;

                    }
                    
                }




            }

        }

    }


