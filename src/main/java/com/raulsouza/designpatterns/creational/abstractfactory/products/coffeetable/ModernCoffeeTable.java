package com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable;

public class ModernCoffeeTable implements CoffeeTable {

  private final String name;

  public ModernCoffeeTable(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
