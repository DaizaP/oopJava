package com.example.oopjava.Seminar4.t1;

public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> iob = new Gen<>(88, "восемьдесят восемь");
        iob.showType();
        int v = iob.getOb();
        System.out.println("Значение: "+ v);
        String s = iob.getOb2();
        System.out.println("Значение: "+ s);
//        System.out.println();
//        Gen<String> sob = new Gen<>("восемьдесят восемь");
//        sob.showType();
//        String s = sob.getOb();
//        System.out.println("Значение: "+ s);
    }
}
