package _11_optional_Class_Improvements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9Tester {

    public static void main(String[] args) {


        // 1- Java8 map ile flatMap farkı
        // https://sinan-karakaya.medium.com/java-stream-api-map-ve-flatmap-kullan%C4%B1m%C4%B1-69e9085d94db

        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        // <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

        // java 8 map ornegi
        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.stream().map(i-> i*i).collect(Collectors.toList()).forEach(System.out::println);

        // java 8 flatMap ornegi
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(4,5,6);
        List<Integer> numbers3 = Arrays.asList(7,8,9);

        List<List<Integer>> integerList = new ArrayList<>();
        integerList.add(numbers1);
        integerList.add(numbers2);
        integerList.add(numbers3);
        System.out.println(integerList);

        integerList.stream().flatMap(i-> i.stream().map(j->j*j)).collect(Collectors.toList()).forEach(System.out::println);

        // 2- Optional class ına stream() eklendi
        // Bir değer varsa, yalnızca bu değeri içeren sıralı bir Akış döndürür, yoksa bos bir Akış döndürür.
        List<Optional<String>> listOptional = Arrays.asList(Optional.empty(),Optional.of("A"),Optional.empty(),Optional.of("B"));

        // since java 9 : before
        listOptional.stream().flatMap(i -> i.isPresent() ? Stream.of(i.get()) : Stream.empty()).collect(Collectors.toList()).forEach(System.out::println);

        // since java 9 : after
        listOptional.stream().flatMap(Optional::stream).collect(Collectors.toList()).forEach(System.out::println);

        // 3- Optional ifPresentOrElse() method
        // Bir değer varsa, verilen eylemi değerle gerçekleştirir, yoksa verilen bos tabanli eylemi gerçekleştirir.
        Optional<Integer> optional = Optional.of(1);

        optional.ifPresentOrElse( x -> System.out.println("Value: " + x),() ->
                System.out.println("Not Present."));


    }
}
