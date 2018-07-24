package cm;

import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FruitGenerator implements F5<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    //@Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }

@Test
public void test(){
        FruitGenerator f = new FruitGenerator();
        System.out.println(f.next());
}
    @Ignore
    @Test
    public void test2(){
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
