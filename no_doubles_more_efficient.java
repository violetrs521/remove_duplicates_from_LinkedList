// All code is written by Violet Smith

import java.util.*;
public class no_doubles_more_efficient {

    

    public static LinkedList<Integer> check(LinkedList<Integer> x){
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int count = x.size();
        for (int i = 0; i < count ; i++){
          
            if(i == 0){
                map.put(x.get(i), true);
            }
            else if(map.containsKey(x.get(i))){
                x.remove(i);
                count = count - 1;
                i = i - 1;
                
            }
            else {
                
                map.put(x.get(i), true);
                
            }

        }
        //System.out.println("This is the HashMap");
        //printHash(map);
        return x;
    }

    public static void print(LinkedList<Integer> x){
        System.out.print("[");
        for(int i = 0; i<x.size(); i++){
            System.out.print(x.get(i) + "   ");
        }
        System.out.println("]");
    }

    public static void printHash(HashMap<Integer, Integer> x){
        
        System.out.println(x);
    }

    public static void main(String[] args) throws Exception {

    //linked list test 1
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(1);
        one.add(2);
        one.add(4);
        one.add(4);
        System.out.println("This is the original first List: ");
        print(one);
        System.out.println(" ");
        
        System.out.println("This is the checked first list: ");
        print(check(one));
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
        System.out.println("This is the second original list: ");
        print(two);
        System.out.println(" ");
        
        System.out.println("This is second checked list: ");
        print(check(two));
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
      
        System.out.println("This is the third original List: ");
        print(three);
        System.out.println(" ");

        System.out.println("This is the third checked list");
        print(check(three));
        



    }
}
