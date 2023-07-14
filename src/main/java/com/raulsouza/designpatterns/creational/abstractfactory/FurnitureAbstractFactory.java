package com.raulsouza.designpatterns.creational.abstractfactory;

import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.Chair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.CoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.Sofa;

public interface FurnitureAbstractFactory {

  Chair createChair(String name);

  Sofa createSofa(String name);

  CoffeeTable createCoffeeTable(String name);

}
