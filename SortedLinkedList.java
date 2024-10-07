import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * SortedLinkedList: This class implements a program that reads a list of integers
 * from user input, stores them into a LinkedList, and sorts them
 * from smallest to largest.
 * @author Dan Gray
 * CSC6301
 * Module 4 Project
 */
public class SortedLinkedList {
    /**
     * Main method of the class
     * @param args default parameter for a main - not used
     */
    public static void main(String[] args)
    {
        LinkedList<Integer> numberLinkedList = new LinkedList<>(); // Object instantiated by Linked List Class
        Scanner inputScanner = new Scanner(System.in); // Object instantiated by the Scanner Class
        
        System.out.println("Input a list of integers pressing the 'return key' after each integer (type 'done' to finish):");
        
        while (inputScanner.hasNext()) 
        {
            String input = inputScanner.next();
            
            if (input.equalsIgnoreCase("done")) // Break condition for the while loop 
            {
                break;
            }
            
            try 
            {
                // Tries to parse 'input' into an integer if fails an exception is raised and asks for another integer
                int myNumber = Integer.parseInt(input); 
                numberLinkedList.add(myNumber);       
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please input an integer or 'done' to finish.");
            }
        }
        inputScanner.close();
    
        Collections.sort(numberLinkedList); // Sorts numberLinkedList

        System.out.println("Sorted linked list: " + numberLinkedList);
    }
}
//#region Code Reuse examples
/* 
- The use of the linked list class:
    The data structure is being leveraged from a premade library instead of me needing to recreate / reinvent the data 
    structure where I am liable to make mistakes in the implementation.

- The use of the scanner class: 
    With the implementation of the scanner class there were a few nuances that we removed from using the prebuilt class 
    such as storing the values as the user inputs them and then needing the itterate through them this is all done by the 
    scanner class and hasNext() method.

- The use of the strinkg class:
    String.equalsIgnoreCase() while this reuse isnt mandatory in my opinion it is a valuable snippet of code as it allows
    me to not rely on the 'done' escape phrase to be in a specific case orientation which if not done could frustrate the
    user as it might not be apparent if there is case sensitivity in the escape phrase.

- The use of the integer class:
    Integer.parseInt() is leveraged from the integer class instead of me trying to figure out if 'input' is an interger
    or not and then having to cast it as an integer.

- The use of the collection class:
    Collection.sort() is leveraged instad of me needing to iterate through my linked list implementing a sorting algorithm
    where I am liable of making a mistake implementing the algorthim.
*/
//#endregion