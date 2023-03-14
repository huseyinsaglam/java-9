package _07_stream_API_Improvements;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java9Tester {

    public static void main(String[] args) {

        // default Stream<T> takeWhile(Predicate<? super T> predicate)
        // bos olmayana kadar degeri al
        Stream.of("a","b","c","d","","e","f").
                takeWhile(s -> !s.isEmpty()).
                forEach(System.out::print);

        System.out.println();
        // default Stream<T> dropWhile(Predicate<? super T> predicate)
        // bos olana kadar degerleri sil geri kalanini al
        Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty())
                .forEach(System.out::print);

        System.out.println();
        Stream.of("a","b","c","","e","","f").dropWhile(s-> !s.isEmpty())
                .forEach(System.out::print);

        System.out.println();
        // static <T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
        IntStream.iterate(3,x->x<10,x->x+3).forEach(System.out::print);

        System.out.println();

        // static <T> Stream<T> ofNullable(T t)
        // ofNullable yöntemi, NullPointerExceptions'ı önlemek ve akışlar için boş denetimlerden kaçınmak için tanıtıldı.
        // Bu yöntem, boş değilse, tek öğe içeren sıralı bir Akış döndürür, aksi takdirde boş bir Akış döndürür.
        long count = Stream.ofNullable(100).count();
        System.out.println(count);

        count = Stream.ofNullable(null).count();
        System.out.println(count);
    }
}
