package com.raulsouza.designpatterns.creational.abstractfactory.factories;

import com.raulsouza.designpatterns.creational.abstractfactory.FurnitureAbstractFactory;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.Chair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.VictorianChair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.CoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.VictorianCoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.Sofa;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureAbstractFactory {

  @Override
  public Chair createChair(String name) {
    return new VictorianChair(name);
  }

  @Override
  public Sofa createSofa(String name) {
    return new VictorianSofa(name);
  }

  @Override
  public CoffeeTable createCoffeeTable(String name) {
    return new VictorianCoffeeTable(name);
  }
}
