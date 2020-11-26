package gr.codehub.pf.exercises.factorial;

public class Factorial {
    public static void main(String[] args) {
        long fact2=1;
        int fact=1;

        Factorial f = new Factorial();
        f.checkIntFactorial(fact,fact);
        f.checkLongFactorial(fact2,fact2);

        //It is the number to calculate factorial
//        while (fact2==fact){
//            fact=fact*i;
//            fact2=fact2*i;
//            i++;
//
//        }
//        fact2=1;
//        while(prevFact<=fact2){
//            prevFact=fact2;
//            fact2=k*fact2;
//            k++;
//
//
//        }
//
//        System.out.println("Int limit:" +(i-2));
//        System.out.println("Long limit:" +(k-2));

    }
    public void checkIntFactorial(int fact1 , int fact2){
        int i=1;
        do {
            i++;
            fact2=fact1;
            fact1=fact1*i;



        }while((fact1/i)==fact2);
        System.out.println("The correct integer factorial stops at " + (i-1));

    }
    public void checkLongFactorial(long fact1 , long fact2){
        int i=1;
        do {
            i++;
            fact2=fact1;
            fact1=fact1*i;



        }while((fact1/i)==fact2);
        System.out.println("The correct long factorial stops at " + (i-1));

    }
}

