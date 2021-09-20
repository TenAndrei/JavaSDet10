package com.collection.class29.HW;

import java.util.ArrayList;

public class Insurance {
/*Create a class Insurance that will have an attribute as insuranceName and
unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.*/
 String insuranceName;
 void getQuote(String insuranceName)  {
this.insuranceName=insuranceName;}
void cancelInsurance(String insuranceName){
  this.insuranceName=insuranceName;
}

static class Car extends Insurance {
  String carModel;
}
static class Pet extends Insurance{
String petType;
}
static class Helth extends Insurance{
}
 public static void main(String[] args) {
  ArrayList<Insurance> task1=new ArrayList<>();
  task1.add(new Pet());
  task1.add(new Car());
  task1.add(new Helth());
  }
}
