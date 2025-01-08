package com.standalonejava;

import java.util.HashSet;
import java.util.Set;

public class FindSubArrayWithSumZero {

    public boolean functsubArray(int[] a) {
        int n = a.length;
        //boolean flag = false;

        //int[] a={-10,1,11,-11};
        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];
                System.out.print(a[j]+" ");
                if (sum == 0) {
                    return true;
                }


            }
            System.out.print(sum);
            System.out.println();

        }
return false;

    }

    public boolean functsubArray1(int[] a){

        int n=a.length;
        int sum=0;

     int x[]=new int[43];


        Set<Integer> findDup=new HashSet<>();

        //int[] a={8,-3,2,1};

        for(int i=0;i<n;i++){

            sum=sum+a[i];
            if(findDup.contains(sum)  || sum==0 || a[i]==0)
                return true;
            findDup.add(sum);
            System.out.println(sum);

        }

        return false;
    }




    public static void main(String[] arg){


        int[] a={8,-3,2,1};
        FindSubArrayWithSumZero obj=new FindSubArrayWithSumZero();
        System.out.println(obj.functsubArray(a));
        System.out.println(obj.functsubArray1(a));


    }


}
