# GroceryStore
Randomly Timed Events:

Since events in the simulation happen at random times, we need to specify a probability that an
event will happen at any given time. For example, if we specify that our time steps in the grocery
store simulation are of duration one minute, we will want to specify the probability that a customer
will arrive in that minute. For this, the nextDouble() method of the Random class is ideal. The
call gen.nextDouble(), where gen is an instance of the Random class, returns a double between
0.0 and 1.0. Suppose we specify that the probability of a customer showing up at the checkout
lines each minute is 0.34. If gen.nextDouble() returns a value less than or equal to 0.34, we
say that a customer has arrived at the checkout lines. Otherwise, no customer has appeared. A
loop handling arrivals might look like this:
for (int time=0; time<simulationDuration; time++) {
if (gen.nextDouble() <= arrivalProbability) {
shortestQueue = getShortestQueue();
shortestQueue.enqueue(customer);
}
}
The other place we are using randomness in this simulation is in the length of time that a transaction
takes. The transaction (checkout) time depends on how many grocery items the customer has and
how long it takes to scan and bag a single item. We will have a fixed time that each item takes to
process, but the number of items a customer has will vary. For this, the Random class’s nextInt()
method is useful: numberOfItems = gen.nextInt(maxItems) + 1. This will give a number
between 1 and the maximum number of items, inclusive

Three Classes:

Customer Class:

1)
Create a class called Customer with the following instance variables and methods.
1. an integer variable representing the number of grocery items the customer has
2. an integer variable representing the time remaining for the customer’s transaction to finish
3. a constructor taking two integer parameters
(a) the number of grocery items
(b) the time it takes for the cashier to process (scan and bag) a single item
4. a getter for the number of items
5. a getter for the time remaining
6. a method for decrementing the time remaining
 
2)
The GroceryStore Class

Create a class called GroceryStore with the following instance variables and methods.
1. An ArrayList of queues. Declare this to hold elements of type Queue.
2. A constructor that takes an integer argument indicating how many lines there are in the
grocery store and initializes the ArrayList appropriately. You will need to create one
queue for each line.
3. A public void method called run that takes the following parameters:
(a) the number of time steps to execute
(b) the probability that a customer will appear with each time step
(c) the time it takes to process (scan and bag) a single item
(d) the maximum number of items a customer might have
The run() method will loop for the given number of time steps, running the simulation.
4. A public void method called printData that takes no parameters and prints out the following:
(a) the number of time steps run
(b) the number of lines
(c) the customer arrival probability
(d) the time per item
(e) the maximum number of items
(f) the maximum length of each queue
(g) the number of customers left in each queue
(h) the total number of customers served

3)
The StoreDriver Class

Write a driver class called StoreDriver to create several instances of the GroceryStore class
with different numbers of lines. Run several simulations on each store varying the parameters to
the run() method. Print out the results of each run.
