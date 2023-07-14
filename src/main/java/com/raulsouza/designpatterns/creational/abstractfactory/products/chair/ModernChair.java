package com.raulsouza.designpatterns.creational.abstractfactory.products.chair;

public class ModernChair implements Chair {

  private final String name;

  public ModernChair(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
