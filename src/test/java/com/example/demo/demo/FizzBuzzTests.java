package test.java.com.example.demo.demo; // Korrigierter Paketname

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions; // Verwenden der Assertions-Klasse für JUnit Jupiter

public class FizzBuzzTests {

    // Machen die FizzBuzzConverter-Klasse statisch, wenn du nicht willst, dass sie an eine Instanz von FizzBuzzTests gebunden ist
    public static class FizzBuzzConverter {
        public String convert(int i) {
            if (i % 3 == 0 && i % 7 == 0) {
            return "FizzBuzz";
            } else if (i % 3 == 0) {
            return "Fizz";
            } else if (i % 7 == 0) {
            return "Buzz";
            }
            return String.valueOf(i);
            }
    }
        
    @Test
    public void fizzBuzzConverter1() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        // Verwenden der Assertions-Klasse von JUnit Jupiter statt Assert
        Assertions.assertEquals("1", fizzBuzz.convert(1));
    }


    @Test
    public void fizzBuzzConverter2() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        // Verwenden der Assertions-Klasse von JUnit Jupiter
        Assertions.assertEquals("2", fizzBuzz.convert(2));
    }
            @Test
        public void fizzBuzzConvertor3() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("Fizz", fizzBuzz.convert(3));
        }
        @Test
        public void fizzBuzzConvertorMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("Fizz", fizzBuzz.convert(6));
        }
        @Test
        public void fizzBuzzConvertorMultiplesOfSeven() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("Buzz", fizzBuzz.convert(7));
}
        @Test
        public void fizzBuzzConvertorMultiplesOfThreeAndSeven() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertNotEquals("FizzBuzz", fizzBuzz.convert(14));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(21));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(42));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(63));
        }
}
s