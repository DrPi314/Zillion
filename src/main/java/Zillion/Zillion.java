/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zillion;

/**
 *
 * @author drpi2
 */
public class Zillion {
    private int[] counter;
    public Zillion(int size) {
        counter = new int[size];
    }
    
    public void increment() {
        for(int i = counter.length; i > 0; i--) {
            if(counter[i-1] == 9) {
                counter[i-1] = 0;
            } else {
                counter[i-1] += 1;
                break;
            }
        }
    }
    
    public String toString(int[] count) {
        String counted = new String();
        for(int i = 0; i < count.length; i++)
            counted += count[i];
        return counted;
    }
}
