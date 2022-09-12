/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.queue;

import java.util.ArrayList;

/**
 *
 * @author bli
 */
public class Queue {
    // így is lehet
    /* 
    private final ArrayList<String> ;

    public Queue() {
    }
    */

    private final ArrayList<String> data;

    public Queue() {
        data = new ArrayList<>();
    }


    public void push(String e) {
        data.add(e);
    }
    
    public String top() {
        if (data.isEmpty()) {
            return null;
        } else {
            return data.get(0);
        }
    }

    public String pop() {
        if (data.isEmpty()) {
            return null;
        } else {
            return data.remove(0);
        }
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void empty() {
        data.clear();
    }

    @Override
    public String toString() {
        return "Queue{" + "data=" + data + '}';
    }    
}