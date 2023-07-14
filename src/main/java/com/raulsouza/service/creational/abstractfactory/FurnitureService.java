package com.raulsouza.service.creational.abstractfactory;

import com.raulsouza.designpatterns.creational.abstractfactory.FurnitureAbstractFactory;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.Chair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.CoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.Sofa;


public class FurnitureService {

  private final FurnitureAbstractFactory furnitureAbstractFactory;

  public FurnitureService(FurnitureAbstractFactory furnitureAbstractFactory) {
    this.furnitureAbstractFactory = furnitureAbstractFactory;
  }

  public Chair createChair(String name) {
    return furnitureAbstractFactory.createChair(name);
  }

  public Sofa createSofa(String name) {
    return furnitureAbstractFactory.createSofa(name);
  }

  public CoffeeTable createCoffeeTable(String name) {
    return furnitureAbstractFactory.createCoffeeTable(name);
  }

}
