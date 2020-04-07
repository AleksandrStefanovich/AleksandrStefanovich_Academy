package by.academy.HomeWork4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataContainer<E> {

   private E[] item;

    public DataContainer(E[] item){
        this.item = item;
    }


   public void add(E item) {
       this.item = Arrays.copyOf(this.item, this.item.length + 1);
       this.item[this.item.length - 1] = item;
   }

   public E[] getData(){
        return item;
   }


}
