/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.queue;

import Queue.console.Console;

/**
 *
 * @author bli
 */
public class TestQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean exit = false;
        while (!exit) {
            System.out.println("MENU");
            System.out.println("1: add a string");
            System.out.println("2: peek at the first string");
            System.out.println("3: pop the first string");
            System.out.println("4: show whether the queue is empty");
            System.out.println("5: print the queue");
            System.out.println("6: clear the queue");
            System.out.println("7: exit");
            int choice = Console.readInt("Pick one: ");
            switch (choice) {
                case 1:
                    String e = Console.readLine("What string do you wish to store? ");
                    queue.push(e);
                    break;
                case 2:
                    System.out.println("The first string is " + queue.top());
                    break;
                case 3:
                    System.out.println("The first string was " + queue.pop());
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("The queue is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("The queue is:");
                    System.out.println(queue);
                    break;
                case 6:
                    System.out.println("The queue is cleared.");
                    queue.empty();
                    break;
                case 7:
                    exit = true;
                    break;
            }
        }
    }
    
}
