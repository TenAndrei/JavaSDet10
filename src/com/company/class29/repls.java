package com.collection.class29;

public  class repls {
    public static void main(String[] args) {

      System.out.println(censorLetter("computer science", 'e'));
      System.out.println(censorLetter("trick or treat", 't'));
    }
    public static String censorLetter(String x, char z)

    {
        return x.replace(z, '*');

    }}



