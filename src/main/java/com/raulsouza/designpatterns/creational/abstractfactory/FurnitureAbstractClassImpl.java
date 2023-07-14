package com.raulsouza.designpatterns.creational.abstractfactory;

import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.Chair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.CoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.Sofa;

public class FurnitureAbstractClassImpl implements FurnitureAbstractFactory {

  private final FurnitureAbstractFactory furnitureAbstractFactory;

  public FurnitureAbstractClassImpl(FurnitureAbstractFactory furnitureAbstractFactory) {
    this.furnitureAbstractFactory = furnitureAbstractFactory;
  }

  @Override
  public Chair createChair(String name) {
    return furnitureAbstractFactory.createChair(name);
  }

  @Override
  public Sofa createSofa(String name) {
    return furnitureAbstractFactory.createSofa(name);
  }

  @Override
  public CoffeeTable createCoffeeTable(String name) {
    return furnitureAbstractFactory.createCoffeeTable(name);
  }
}
