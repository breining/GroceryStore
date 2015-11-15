
package customer;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Ben Reining
 */
public class GroceryStore {
    private int steps;
    private int numberOfLines = 5;
    private double probability;
    private int scanningTime;
    private int maxItems = 20;
    private int maxQueueLength;
    private int customersLeft;
    private int customersServed;
    Random gen = new Random();
    
    ArrayList<Queue> myQueue = new ArrayList<>();
    
    public GroceryStore(int numberOfLines){
        this.numberOfLines = numberOfLines;
        myQueue = new ArrayList<>();
        for(int i = 1; i < numberOfLines; i++){
           myQueue = new ArrayList<>();
        }
    }
    
    public void run(int steps, double probability, int timeToProcess, int maxItems){
        
        probability = .34;
        int items;
        items = gen.nextInt(maxItems) + 1;
        timeToProcess = items * scanningTime;
        
        ArrayList<Queue> shortestQueue = null;
        for(int i = 0; i < numberOfLines; i++){
            if()
                
        }
        for(int time = 0; time<simulationDuration; time++){
            if(gen.nextDouble() <= probability){
                shortestQueue = getShortestQueue();
                shortestQueue.enqueue(customer);
            }
        }
        
        steps++;
    }
    
    public void printData(){
        System.out.printf("Steps taken: ", steps);
        System.out.println();
        
        System.out.printf("Number of check-out lines: ", numberOfLines);
        System.out.println();
        
        System.out.printf("Customer arrival probability: ", probability);
        System.out.println();
        
        System.out.printf("Scanning time: ", scanningTime);
        System.out.println();
        
        System.out.printf("Maximum number of items: ", maxItems);
        System.out.println();
        
        System.out.printf("Maximun number in each queue: ", maxQueueLength);
        System.out.println();
        
        System.out.printf("Customers left in each queue: ", customersLeft);
        System.out.println();
        
        System.out.printf("Customers served: ", customersServed);
        System.out.println();
    }
    
    
    
    
}
