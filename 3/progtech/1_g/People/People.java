/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

/**
 *
 * @author bli
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Doug", 31);        
        System.out.println("p1 is " + p1.getName());
        Person p2 = new Person("Anne", 42);
        System.out.println("p2 is " + p2.getName());        
        changeName(p2);
        System.out.println("p2's name changed: " + p2.getName());
        int i = 5;
        changeInt(i);
        System.out.println("i's value has not changed: " + i);
        i = increaseInt(i);
        System.out.println("we can change i's value by returning the new value: " + i);
    }
    
    public static void changeName(Person p) {
        p.setName("Frank");
    }
    
    public static void changeInt(int param) {
        param += 6;
    }
    
    public static int increaseInt(int param) {
        return param + 6;
    }
    
}
