package com.nzh;

public class exe11 {


    public static void main(String[] args) {
        SimpleArrayList<String>list = new SimpleArrayList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add(2,"super");
        list.add("3");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("g");
        list.add("h");
        list.add("i");
        System.out.println(list.get(2));
        System.out.println(list.indexOf("3"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove("dre"));
        System.out.println(list.change("super","super cool"));
        System.out.println(list.get(2));
        System.out.println(list.indexOf("h"));
    }

}
