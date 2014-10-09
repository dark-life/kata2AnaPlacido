/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, Integer> histogram = new HashMap<>();
        int[] numbers = {2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};
        
        for (int number : numbers) {
            histogram.put(number, getFrequency(number, histogram)+1);
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "-> " + histogram.get(key));
        }
        
        int number = 0;
        int maxOcurrence=0;
        
        for (Integer key : histogram.keySet()) {
            if(histogram.get(key)>maxOcurrence){
                number = key;
                maxOcurrence = histogram.get(key);
            }
            
        }
        
        System.out.println("El numero que mas se repite es: " + number + "->" + maxOcurrence);
    }

    private static Integer getFrequency(int number, Map<Integer, Integer> histogram) {
        if(histogram.containsKey(number)){
            return histogram.get(number);
        }
        return 0;
    }
}
