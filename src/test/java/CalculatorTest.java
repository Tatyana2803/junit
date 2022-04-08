import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator sut;

    @BeforeAll
    public static void startedAll(){
        System.out.println("tests started");
    }

    @AfterAll
    public static void finisheddAll(){
        System.out.println("tests finished");
    }

    @BeforeEach
    public void init(){
        sut = new Calculator();
        System.out.println("test started");
    }

    @AfterEach
    public void finish(){
        System.out.println("test finished");
    }

    @Test
    public void testSum() {
        //arrage
        int a = 13, b=13, expected = 26;
        //act
        int result = sut.sum(a,b);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumFirst(){
        //arrage
        int a = 4, b = 7;
        String expected = "Меньше первое число";
        //act
        String result = sut.minimum(a,b);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumSecond(){
        //arrage
        int a = 7, b = 4;
        String expected = "Меньше второе число";
        //act
        String result = sut.minimum(a,b);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumNothingIs(){
        //arrage
        int a = 4, b = 4;
        String expected = "Числа равны";
        //act
        String result = sut.minimum(a,b);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply(){
        //arrage
        int a = 8, b = 10, expected = 80;
        //act
        int result =  sut.multiply(a,b);
        //assert
        assertEquals(expected, result);
    }

}
