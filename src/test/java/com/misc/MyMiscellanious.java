package com.misc;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.*;
import static org.apache.commons.lang3.ArrayUtils.toArray;

public class MyMiscellanious {

    public static void main(String[] args){
        String dummy="dummy";

        String myString="I am amol rathod abcdef with anything";

        String[] strArray=myString.split(" ");

        Arrays.sort(strArray, (a,b)->(a.length()-b.length()));

        System.out.println(strArray[strArray.length-1]);

        System.out.println(Arrays.asList(strArray));

        TreeMap<Integer, String> myMap=new TreeMap<>();
        for(int i=0;i<strArray.length;i++){
            myMap.put(strArray[i].length(), strArray[i]);
        }
        System.out.println(myMap);

        myMap.remove(myMap.lastEntry().getKey());

        System.out.println(myMap.lastEntry());




        Set<Integer> set=new TreeSet<>();

        for(int i=0;i<strArray.length;i++){
            set.add(strArray[i].length());
        }
        System.out.println(set);

        List<String> sList=new ArrayList<String>();
        sList.add("Sumit");
        sList.add("Amol");
        sList.add("Sachin");
        sList.add("Ansh");
        sList.add("meranaamjoker");
        sList.add("Sachin");

String[] a=new String[]{"a","b","amol"};

String[] b=Stream.of(a).filter(t->t.startsWith("a")).toArray(i -> new String[i]);
        System.out.println(Arrays.asList(b));

        Map<Integer, List<String>> mapp= sList.stream()
                .collect(groupingBy(e->e.length(), Collectors.toList()));


        System.out.println(mapp);
        String seHighest=sList.stream().sorted((q,r)->Integer.compare(r.length(),q.length())).distinct().skip(1).findFirst().get();
        System.out.println(seHighest);


        Map<String, Long> strRepitation =sList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(strRepitation);
        String mString="aabhdbjabj";
        Collection<Long> str=strRepitation.values();








        IntStream c=mString.chars();
        c.forEach(System.out::println);

        Map<Character, Long> repCharMap=mString.chars().mapToObj(s->(char)s).collect(groupingBy(s->(s), counting()));
        System.out.println(repCharMap);







    }


    public static void testArrayTypeSafety() {


        String[] strings = new String[3];
        Object[] objects = strings;
        objects[0] = 4;
        System.out.println(objects[0]);

        ArrayList<String> stringsal = new ArrayList<>();
        //ArrayList<Object> objectsal=stringsal;


    }

}
