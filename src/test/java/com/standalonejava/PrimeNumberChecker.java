package com.standalonejava;

public class PrimeNumberChecker {



        public static Boolean  validate(final Integer primeNumber) {

            for (int i = 2; i < (primeNumber / 2); i++) {

                if (primeNumber % i == 0) {


                    return false;
                }
            }
            System.out.println((primeNumber / 2));
            return true;
        }

        public static void main(String[] a){

            System.out.println(validate(45));
        }

}
