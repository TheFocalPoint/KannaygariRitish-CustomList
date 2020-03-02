package com.epam.customlist;

public class App 
{
    public static void main( String[] args )
    {
        MyCustomList<String> myList = new MyCustomList<String>();
             
             myList.add("Ritish");
             myList.add("Epam");
             myList.add("CustomList");
             myList.add("Home Task");
             myList.add("Submissions");
             
             
             System.out.println("My List: "+myList.toString());
             
             
             myList.delete(0);
             
             System.out.println("After Deleting "+myList.toString());

    }
}
