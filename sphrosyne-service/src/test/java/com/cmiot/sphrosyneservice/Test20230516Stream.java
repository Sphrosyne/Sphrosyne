package com.cmiot.sphrosyneservice;

import com.cmiot.sphrosyne.pojo.User;
import com.jayway.jsonpath.MapFunction;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Test20230516Stream {
    @Test
    public void SteamTest() {
        List<String> words=Arrays.asList("Monday","Tuesday");
        Stream<String[]> stream = words.stream().map(word -> word.split(""));
        Stream<String> stringStream = stream.flatMap(Arrays::stream);
        stringStream.forEach(System.out::println);


        List<String> characters=words.stream()
                .map(word->word.split(""))//将每个单词转化为一个字符串数组
                .flatMap(Arrays::stream)//将每个字符数组扁平化
                .collect(toList());
        System.out.println(characters);//[M, o, n, d, a, y, T, u, e, s, d, a, y]

        List<User> list = Arrays.asList(
                new User(1l,"x",2,"y","tt"),
                new User(2l,"xxxx",3,"y44","sdaa"));

    }
}
