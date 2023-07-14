package com.raulsouza.designpatterns.creational.abstractfactory.products.chair;

public class VictorianChair implements Chair {

  private final String name;

  public VictorianChair(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
