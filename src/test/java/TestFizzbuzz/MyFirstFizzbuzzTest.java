package TestFizzbuzz;

import com.Fizzbuzz;
import org.junit.Assert;
import org.junit.Test;

public class MyFirstFizzbuzzTest {
    @Test
    public void multipleOf3(){
        int answer = 1 + 2;
        Fizzbuzz fizz = new Fizzbuzz();
        Assert.assertEquals("is not multiple of 3", "Fizz" ,fizz.isMultipleOf3(15));
    }

    @Test
    public void multipleOf5(){
        int answer = 1 + 2;
        Fizzbuzz fizz = new Fizzbuzz();
        Assert.assertEquals("is not multiple of 5", "Buzz" ,fizz.isMultipleOf5(15));
    }

    @Test
    public void checkFizzBuzz(){
        int answer = 1 + 2;
        Fizzbuzz fizz = new Fizzbuzz();
        Assert.assertEquals("is not multiple of 5", "FizzBuzz" ,fizz.checkFizzBuzz(15));
    }
}
