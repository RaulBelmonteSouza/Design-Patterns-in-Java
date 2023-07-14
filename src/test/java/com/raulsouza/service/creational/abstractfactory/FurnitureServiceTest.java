package com.raulsouza.service.creational.abstractfactory;

import static org.assertj.core.api.Assertions.assertThat;

import com.raulsouza.designpatterns.creational.abstractfactory.FurnitureAbstractFactory;
import com.raulsouza.designpatterns.creational.abstractfactory.factories.ModernFurnitureFactory;
import com.raulsouza.designpatterns.creational.abstractfactory.factories.VictorianFurnitureFactory;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.Chair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.ModernChair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.chair.VictorianChair;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.CoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.ModernCoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.coffeetable.VictorianCoffeeTable;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.ModernSofa;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.Sofa;
import com.raulsouza.designpatterns.creational.abstractfactory.products.sofa.VictorianSofa;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FurnitureServiceTest {

  private FurnitureService furnitureService;

  private FurnitureService createFurnitureService(
      FurnitureAbstractFactory furnitureAbstractFactory) {
    return new FurnitureService(furnitureAbstractFactory);
  }

  @Test
  void shouldCreateModernFurniture() {
    furnitureService = createFurnitureService(new ModernFurnitureFactory());

    Chair modernChair = furnitureService.createChair("Modern Chair");
    Sofa modernSofa = furnitureService.createSofa("Modern Sofa");
    CoffeeTable modernCoffeeTable = furnitureService.createCoffeeTable("Modern Coffee Table");

    assertThat(modernChair).isInstanceOf(ModernChair.class);
    assertThat(modernSofa).isInstanceOf(ModernSofa.class);
    assertThat(modernCoffeeTable).isInstanceOf(ModernCoffeeTable.class);
  }

  @Test
  void shouldCreateVictorianFurniture() {
    furnitureService = createFurnitureService(new VictorianFurnitureFactory());

    Chair vitorianChair = furnitureService.createChair("Victorian Chair");
    Sofa vitorianSofa = furnitureService.createSofa("Victorian Sofa");
    CoffeeTable vitorianCoffeeTable = furnitureService.createCoffeeTable("Victorian Coffee Table");

    assertThat(vitorianChair).isInstanceOf(VictorianChair.class);
    assertThat(vitorianSofa).isInstanceOf(VictorianSofa.class);
    assertThat(vitorianCoffeeTable).isInstanceOf(VictorianCoffeeTable.class);
  }

}
