package by.academy.HomeWork4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataContainer<E> {

   private E[] item;
   private int counter = 0;

   public void add(E item){
       E[] tempItem = (E[]) new Object[counter];
       for (int i = 0; i < counter ; i++) {
           tempItem[i] = this.item[i];
       }
       this.item = (E[])new Object[counter+1];
       this.item[counter]=item;
       if (counter > 0){
           for (int i = 0; i < counter - 1; i++) {
               this.item[i] = tempItem[i];
           }
       }
       this.counter++;
   }

   public E[] getData(){
        return item;
   }


}
