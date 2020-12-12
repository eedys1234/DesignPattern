package DesignPattern.Tank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import Lampda.IntegerSumSpliterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	List<Integer> dataSet = IntStream.rangeClosed(0, 10000).boxed().collect(Collectors.toList());
    	
    	long start = System.currentTimeMillis();
//    	dataSet.parallelStream().reduce(Integer::sum).ifPresent(System.out::println);
    	dataSet.stream().reduce(Integer::sum).ifPresent(System.out::println);
//    	System.out.println(dataSet.stream().reduce(0, (a, b)-> a + b));
//    	StreamSupport.stream(new IntegerSumSpliterator(dataSet), true)
//    				.reduce(Integer::sum)
//    				.ifPresent(System.out::println);
    	
    	long end = System.currentTimeMillis();
    	
    	System.out.println((end-start));
    	
    }
}
