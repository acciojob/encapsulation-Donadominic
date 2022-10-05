package com.driver;

public class Main {
  pubic static void main(String[]args) {
    RWOnly r1=new RWOnly();
    r1.setValue(6);
    int val=r1.getValue();
  }
}
