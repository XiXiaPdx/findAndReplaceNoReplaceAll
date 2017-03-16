import org.junit.*;
import static org.junit.Assert.*;

public class testFindAndReplace{
  @Test
  public void returnWordsArray_simplest(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "damn";
    assertEquals(expectedOutPut, newGame.find("hoe", "hoe", "damn"));

 }
  @Test
  public void returnWordsArray(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "fhodamn";
    assertEquals(expectedOutPut, newGame.find("fhohoe", "hoe", "damn"));

 }
  @Test
  public void returnWordsArray_1letterPassReplace(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "fhodamnl";
    assertEquals(expectedOutPut, newGame.find("fhohoel", "hoe", "damn"));
  }
  @Test
  public void returnWordsArray_2lettersPastReplace(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "fhodamnlx";
    assertEquals(expectedOutPut, newGame.find("fhohoelx", "hoe", "damn"));
  }
  @Test
  public void returnWordsArray_2ReplaceBackToBack(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "fhodamndamn";
    assertEquals(expectedOutPut, newGame.find("fhohoehoe", "hoe", "damn"));
  }
  @Test
  public void returnWordsArray_ReplaceAtFront(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "damnfl";
    assertEquals(expectedOutPut, newGame.find("hoefl", "hoe", "damn"));
  }
  @Test
  public void returnWordsArray_2ReplaceWithLetterBetween(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "fhodamnxdamn";
    assertEquals(expectedOutPut, newGame.find("fhohoexhoe", "hoe", "damn"));
  }
  @Test
  public void returnWordsArray_ReplaceSmallerThanTarget(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "x";
    assertEquals(expectedOutPut, newGame.find("hoe", "hoe", "x"));

 }

}
