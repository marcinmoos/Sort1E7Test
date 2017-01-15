/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomsort;


import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Marcin
 */
public class RandomSortTest {
    
    RandomSort sort;
    long start, stop;
            
    public RandomSortTest() {
        sort = new RandomSort();
    }

    
    @Before
    public void Before() {
        start = System.nanoTime();
    }
    
    @After
    public void After(){
        System.out.println((stop-start) +" ns");
    }
    

    @Test
    public void testLosuj() {
        sort.losuj();
        stop = System.nanoTime();
        System.out.print("Czas losowania:  ");
    }

    @Test
    public void testSortuj() {
        sort.sortuj();
        stop = System.nanoTime();
        System.out.print("Czas sortowania: ");
    }
}
