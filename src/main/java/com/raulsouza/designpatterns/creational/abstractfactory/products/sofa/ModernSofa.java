package com.raulsouza.designpatterns.creational.abstractfactory.products.sofa;

public class ModernSofa implements Sofa {

  private final String name;

  public ModernSofa(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
