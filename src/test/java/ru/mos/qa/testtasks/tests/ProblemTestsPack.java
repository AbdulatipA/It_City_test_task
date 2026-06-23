package ru.mos.qa.testtasks.tests;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProblemTestsPack {

  private String CONST = "const";
  private final static String bd = "pui";

  @Test
  public void equalsOneToOne(){
    assertEquals("1", "1");
  }


  @Test
  public void assignValueToConstVar(){
    CONST = "newValue";
    assertEquals("newValue", CONST);
  }


  // такой метод уже существует выше
//  @Test
//  public static void equalsOneToOne(){
//    assertEquals(1, 1);
//  }



  @Test
  public void stringsMustBeEqual(){
    String res = "a";

    if (bd == new String("pui")) {
      res = "asd";
    }

    assertEquals("a", res);
  }

  @Test
  public void successfullyRemovingFirstElementFromList(){
    List<String> sourceData = new ArrayList<>(List.of("1", "viskas", "chupocabra"));

    // лист нельзя перебирать удаляя/добавляя оттуда элементы, нужно через Iterator, или просто удалить 1-й
    //элемент исходя из названия метода
//    for (String element: sourceData){
//      sourceData.remove(element);
//    }

    sourceData.remove(0);
    assertFalse(sourceData.contains("1"));
  }
}