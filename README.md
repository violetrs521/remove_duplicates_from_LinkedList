# remove_duplicates_from_LinkedList

This java code is designed to take an input of a linkedList of integers and remove all the duplicate integer values. 

The code first declares a method that is passed a Linked list and declares that it will return a linked List.
  It then declares a hashmap where the values of the linked list will be stored. It also declares a count variable
  to keep track of the size of the Linked List. It then loops through the linked list. In the loop there
  are three checks the code performs. 
        First it checks if it is the first iteration of the loop, if so since
        there are no other values to compare it to in the hashmap it places the 
        value into the hashmap as the value with the key being the iteration number of the loop.
        
        It then checks if the hashmap contains the linked list value, and if the 
        value is the same as one in the hashmap it removes that value from the linkedlist,
        decrements the count, and decrements the i value for the loop. 
        
        Then if those two checks are false it adds the value to the hashmap. 
        It then returns the linked list with no duplicates.
 
The code then declares a print method for linked lists, that loops through the linked list and prints all the values.

The code also has a method to print out the hashmap, for testing purposes

The code then has a main function that creates three separate linked lists, with various values and prints the 
  original list before running it through the check function, then prints out each list after running the check function.

