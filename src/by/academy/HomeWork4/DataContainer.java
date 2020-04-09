package by.academy.HomeWork4;

import javax.xml.crypto.Data;
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

   public static void sort(DataContainer<Person> item, PersonRegistrationComparator comp){
       Person tempContainer = new Person(null,null,null);
       for (int i = 0; i < item.getData().length; i++) {
           switch (comp.compare(item.getData()[i],item.getData()[i+1])){
               case 0: {
                   break;}
               case 1: {
                  tempContainer =  item.getData()[i];
                  item.getData()[i] = item.getData()[i+1];
                  item.getData()[i+1] = tempContainer;
                   break;}
               case -1: {
                   tempContainer =  item.getData()[i+1];
                   item.getData()[i+1] = item.getData()[i];
                   item.getData()[i] = tempContainer;
                   break;}
           }
       }item.getData();

   }

   public static void sort(DataContainer<Animal> item , AnimalAgeComparator comp){}

   public E[] getData(){
        return item;
   }


}
