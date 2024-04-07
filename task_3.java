@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;
  }

   @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		  { 1, false},
          { 20, true},
          { 22, true},
          { 99, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Пользователю ", this.result, isAdult);
	}
}
