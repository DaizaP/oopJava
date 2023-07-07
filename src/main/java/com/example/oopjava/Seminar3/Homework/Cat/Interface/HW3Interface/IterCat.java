package com.example.oopjava.Seminar3.Homework.Cat.Interface.HW3Interface;

import com.example.oopjava.Seminar3.Homework.Cat.Interface.Cats;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class IterCat implements Iterable<Cats>{
    private ArrayList<Cats> catsArrayList;
    public IterCat(ArrayList<Cats> catsArrayList){
        this.catsArrayList = catsArrayList;
    }
    @Override
    public Iterator<Cats> iterator() {
        return new CatIterator();
    }
    private class CatIterator implements Iterator<Cats> {
        int current =0;

        @Override
        public boolean hasNext() {
            return current != catsArrayList.size();
        }

        @Override
        public Cats next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return catsArrayList.get(current++);
        }
    }
}
