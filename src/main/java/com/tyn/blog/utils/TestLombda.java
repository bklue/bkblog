package com.tyn.blog.utils;

import java.util.*;

/**
 * @author wangl
 * @Description todo
 * @date 12/13/2019 11:43 AM
 */
public class TestLombda {

    public static void main(String[] args) {
        String[] arr = new String[]{"哈士奇","萨摩耶","阿拉斯加"};
        List<String> dogs = new ArrayList<>();
        Collections.addAll(dogs,arr);
        //只输出遍历拿出的值
        dogs.forEach(System.out::println);
        //对遍历的值进行操作,一个参数不用（）
        dogs.forEach( s -> {
          if ("哈士奇".equals(s)){
              System.out.println(dogs.indexOf(s));
          }
        });

        //map的遍历
        Map<Integer,String> maps = new HashMap();
        maps.put(1, "test1");
        maps.put(2, "test2");
        maps.forEach((Integer k,String  v) -> {
            if (k == 1){
                maps.put(1,"test11");
            }
            System.out.println("Key : " + k + " Value : " + v);
        });
        maps.forEach((k,v)-> System.out.println(v));

    }
}
