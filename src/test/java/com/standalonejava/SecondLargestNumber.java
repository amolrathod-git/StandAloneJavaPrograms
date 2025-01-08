package com.standalonejava;

public class SecondLargestNumber {

    private int findSecondLargestnum(int[] a) {
        int largest= Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;


        //int[] a={50,3,1,2,25,24};

        for(int i=0;i<a.length;i++){

            if(a[i]>largest ) {

                secLargest = largest;
                largest = a[i];
            }
            else if (a[i]>secLargest && secLargest<largest ){
                    secLargest=a[i];


            }

            }

      /*  for(int i=0;i<a.length;i++){
            if(a[i]>secLargest && a[i]<largest){
                secLargest=a[i];
            }

        }*/

        return secLargest;

    }



    public static void main(String[] args){
        SecondLargestNumber obj=new SecondLargestNumber();
        int[] a={50,51,3,1,2,25,24,26};
        System.out.println(obj.findSecondLargestnum(a));
        System.out.println(obj);



    }



}
