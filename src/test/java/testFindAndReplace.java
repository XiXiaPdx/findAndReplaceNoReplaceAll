import org.junit.*;
import static org.junit.Assert.*;

public class testFindAndReplace{

  @Test
  public void returnWordsArray(){
    findAndReplace newGame = new findAndReplace();
    String expectedOutPut = "fhodamnl";
    assertEquals(expectedOutPut, newGame.find("fhohoel", "hoe", "damn"));
  }

    @Test
    public void returnWordsArray2(){
      findAndReplace newGame = new findAndReplace();
      String expectedOutPut = "damn";
      assertEquals(expectedOutPut, newGame.find("fho hoe lee", "hoe", "damn"));

  }
}
