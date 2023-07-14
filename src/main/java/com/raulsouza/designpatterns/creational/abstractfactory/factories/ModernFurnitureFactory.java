package com.raulsouza.designpatterns.creational.abstractfactory.factories;

import com.raulsouza.designpatterns.creational.abstractfactory.FurnitureAbstractFactory;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.Chair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.ModernChair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.CoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.ModernCoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.ModernSofa;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureAbstractFactory {

  @Override
  public Chair createChair(String name) {
    return new ModernChair(name);
  }

  @Override
  public Sofa createSofa(String name) {
    return new ModernSofa(name);
  }

  @Override
  public CoffeeTable createCoffeeTable(String name) {
    return new ModernCoffeeTable(name);
  }
}
