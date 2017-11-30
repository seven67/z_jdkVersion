package person.seven.jdk8;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author liuqi
 * @create 2017-11-30
 **/
public class StreamTest {

    private static final List<Person> list = Lists.newArrayList();
    private static final List<String> listString = Lists.newArrayList();
    static {
        Person person = new Person("张三",false,18);
        list.add(person);
        list.add(person);
        list.add(new Person("李四",false,18));
        list.add(new Person("王五",true,28));
        list.add(new Person("赵六",false,16));
        list.add(new Person("刘七",true,22));
        listString.add("I am a boy");
        listString.add("I love the girl");
        listString.add("But the girl loves another girl");
    }


    public static void main(String[] args) {
//        filter();
//        distinct();
//        limit();
//        map();
//        split();
        anyMatch();
    }


    private static void List2Stream(){
        Stream<Person> stream = list.stream();
    }

    private static void array2Stream(){
        String[] list = {"larry","sharray"};
        Stream<String> stream = Arrays.stream(list);
    }

    private static void value2Stream(){
        Stream<String> stream = Stream.of("a","b");
    }

    private static void filter(){
        List<Person> result = list.stream().filter(Person::isStudent).collect(toList());
        result.stream().forEach(person -> System.out.println(person));
    }

    private static void distinct(){
        List<Person> result = list.stream().distinct().collect(toList());
        result.stream().forEach(person -> System.out.println(person));
    }

    private static void limit(){
        List<Person> result = list.stream().limit(3).collect(toList());
        result.stream().forEach(person -> System.out.println(person));
    }

    private static void map(){
        List<String> result = list.stream().map(Person::getName).collect(toList());
        result.stream().forEach(person -> System.out.println(person));
    }

    private static void split(){
        List<String> result = listString.stream()
                .map(line -> line.split(" ")).flatMap(Arrays::stream).collect(toList());
        result.stream().forEach(person -> System.out.println(person));
    }

    private static void anyMatch(){
        boolean result = list.stream().anyMatch(Person::isStudent);
        System.out.println(result);
    }

    private static void toMap(){
//        Map<String, Person> map = list.stream().collect(toMap(Person::getName, Function.identity()));
    }
}
