@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expectedResult = true;
    assertEquals("Пользователю меньше 18 лет", expectedResult, isAdult);
}
