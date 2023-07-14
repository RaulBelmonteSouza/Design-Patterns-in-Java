package com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable;

public class VictorianCoffeeTable implements CoffeeTable {

  private final String name;

  public VictorianCoffeeTable(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
