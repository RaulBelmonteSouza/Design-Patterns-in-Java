package com.raulsouza.designpatterns.creational.abstractfactory.products.sofa;

public class VictorianSofa implements Sofa {

  private final String name;

  public VictorianSofa(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

}
