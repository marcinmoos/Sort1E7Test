package randomsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomSort {

    List<Integer> liczby;
    
    public RandomSort() {
        liczby = new ArrayList<>();
    }


    void losuj(){
        Random losownik = new Random();
        for(int i = 1; i<10000000; i++){
            liczby.add(losownik.nextInt());
        }
    }
    void sortuj(){
        liczby.sort((Integer int1, Integer int2) -> {
            return Integer.compare(int1, int2);
        });
    }
}
