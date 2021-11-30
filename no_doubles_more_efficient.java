// All code is written by Violet Smith

import java.util.*;
public class no_doubles_more_efficient {

   
    // removes the doubles from a linked list
    public static LinkedList<Integer> check(LinkedList<Integer> x){
        //creates a hashmap to store the values of the linked list in 
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int count = x.size();
        for (int i = 0; i < count ; i++){
          
            // if it is the first value of the linked list, add that value to the hashmap
            if(i == 0){
                map.put(x.get(i), true);
            }

            //if the map contains the value of the linked list at position i, it removes the value from the linked list
            // it then decrements the count and the iterator since there is one less value in the linked list
            else if(map.containsKey(x.get(i))){
                x.remove(i);
                count = count - 1;
                i = i - 1;
                
            }
            else {
                //adds the linked list value at position i to the hashmap
                map.put(x.get(i), true);
            }

        }
        //System.out.println("This is the HashMap");
        //printHash(map);
        return x;
    }

    //prints a linked list in brackets 
    public static void print(LinkedList<Integer> x){
        System.out.print("[");
        for(int i = 0; i<x.size(); i++){
            System.out.print(x.get(i) + "   ");
        }
        System.out.println("]");
    }

    //prints a hashmap (For testing)
    public static void printHash(HashMap<Integer, Integer> x){
        System.out.println(x);
    }

    // prints an iterator
    public static void printIterator(ListIterator<Integer> it){
        
        while(it.hasNext()){
            System.out.print(it.next());
            System.out.print(" ");
        }

    }


    public static void main(String[] args) throws Exception {

    //linked list test 1
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(1);
        one.add(2);
        one.add(4);
        one.add(4);

        //prints the first list before the doubles are removed
        System.out.println();
        System.out.println("This is the original first List: ");
        print(one);
        System.out.println(" ");

        //prints and sets the first linked list iterator
        ListIterator<Integer> oneIt = one.listIterator();
        System.out.println("List one Iterator: ");
        printIterator(oneIt);
        System.out.println(" ");
        System.out.println(" ");
        
        //prints the first list after the doubles are removed
        System.out.println("This is the checked first list: ");
        print(check(one));
        System.out.println(" ");
        
        //prints and sets the first linked list iterator after the doubles are removed
        ListIterator<Integer> oneItChecked = one.listIterator();
        System.out.println("List one Iterator Checked: ");
        printIterator(oneItChecked);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


    //Linked list test 2
        LinkedList<Integer> two = new LinkedList<Integer>();
        two.add(1);
        two.add(1);
        two.add(4);
        two.add(4);
        two.add(4);
        two.add(5);
    

        //prints the second list before taking out the doubles
        System.out.println("This is the second original list: ");
        print(two);
        System.out.println(" ");
        
        // Sets a Iterator for the second linked list and prints it
        ListIterator<Integer> twoIt = two.listIterator();
        System.out.println("List two Iterator: ");
        printIterator(twoIt);
        System.out.println(" ");
        System.out.println(" ");

        //prints the second list after taking out the doubles
        System.out.println("This is second checked list: ");
        print(check(two));
        System.out.println(" ");
        
        //prints the second linked list iterator after the doubles are taken out
        ListIterator<Integer> twoItChecked = two.listIterator();
        System.out.println("List two Iterator Checked: ");
        printIterator(twoItChecked);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");



       
    //Linked list test 3
        LinkedList<Integer> three = new LinkedList<Integer>();
        three.add(1);
        three.add(6);
        three.add(43);
        three.add(43);
        three.add(2);
        three.add(3);
        three.add(7);
        three.add(8);
        three.add(4);
      

        //prints the third list before the doubles are taken out
        System.out.println("This is the third original List: ");
        print(three);
        System.out.println(" ");
        
        //prints and sets the third linked list iterator 
        ListIterator<Integer> threeIt = three.listIterator();
        System.out.println("List three Iterator: ");
        printIterator(threeIt);
        System.out.println(" ");
        System.out.println(" ");

        //prints the third list after the doubles are removed
        System.out.println("This is the third checked list");
        print(check(three));
        System.out.println(" ");
       
      
        //prints and sets the Iterator for the third list after the doubles are removed
        ListIterator<Integer> threeItChecked = three.listIterator();
        System.out.println("List three Iterator Checked: ");
        printIterator(threeItChecked);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        

     //Linked list test 4
        LinkedList<Integer> four = new LinkedList<Integer>();
        four.add(1);
        four.add(2);
        four.add(3);
        four.add(4);
        four.add(4);
        four.add(5);
        four.add(7);
        four.add(10);
        four.add(10);
        four.add(10);
        four.add(10);
        four.add(10);
        four.add(10);
      
        //prints the fourth linked list before the doubles are removed
        System.out.println("This is the fourth original List: ");
        print(four);
        System.out.println(" ");

        //prints and sets the fourth linked list iterator 
        ListIterator<Integer> fourIt = four.listIterator();
        System.out.println("List fourth Iterator: ");
        printIterator(fourIt);
        System.out.println(" ");
        System.out.println(" ");

        //prints the fourth linked list after the doubles are taken out
        System.out.println("This is the fourth checked list");
        print(check(four));
        System.out.println(" ");

        //prints and sets the Iterator for the fourth list after the doubles are removed
        ListIterator<Integer> fourItChecked = four.listIterator();
        System.out.println("List fourth Iterator Checked: ");
        printIterator(fourItChecked);
        System.out.println(" ");
        


    }
}
