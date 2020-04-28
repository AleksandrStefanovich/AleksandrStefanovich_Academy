package by.academy.HomeWork4;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<E> implements Serializable {

   private E[] item;

   public DataContainer(E[] item){
        this.item = item;
    }

   public E[] getData(){
        return item;
   }


   public void add(E item) {
       this.item = Arrays.copyOf(this.item, this.item.length + 1);
       this.item[this.item.length - 1] = item;
   }

   public void delete(int index){
       if (index >= 0 && index < this.item.length) {
           for (int i = index; i < this.item.length - 1; i++) {
               this.item[i] = this.item[i + 1];
           }
           this.item = Arrays.copyOf(this.item, this.item.length - 1);
       } else {
           System.out.println("Index is out of array's bounds");
       }
   }

   public void delete(E item){
       boolean deleted = false;
       for (int i = 0; i < this.item.length; i++) {
           if (this.item[i].equals(item)){
               this.delete(i);
               deleted = true;
               break;
           }
       }
       if (!deleted){
           System.out.println("No element to delete found");
       }

   }

   public static <E> void sort(DataContainer<E> item , Comparator<E> comp){
       E tempContainer;
       int containerMaxValueIndex = 0;   //сортировка вместо перестановки объектов местами
       int containerMinValueIndex = 0;   //обменивают ссылки на объекты
       E containerMaxValue;
       E containerMinValue;
       boolean maxChange = false;
       boolean minChange = false;

       for (int counter = 0; counter < item.getData().length/2; counter++) {

           containerMaxValue = item.getData()[counter];  //каждую итерацию находятся мин и макс
           containerMinValue = item.getData()[counter];  //и обмениваются ссылками с крайними элементами
                                                     //продвигаясь от краёв массива к центру
           for (int i = counter; i < item.getData().length-counter; i++) {
               if (comp.compare(containerMaxValue, item.getData()[i]) == 1) {
                   containerMaxValue = item.getData()[i];
                   containerMaxValueIndex = i;
                   maxChange = true;
               }
               if (comp.compare(containerMinValue, item.getData()[i]) == -1) {
                   containerMinValue = item.getData()[i];
                   containerMinValueIndex = i;
                   minChange = true;
               }
           }
           if (minChange) {   //проверка на случай если элемент на своём месте
           tempContainer = item.getData()[counter];
           item.setData(containerMinValue, counter);
           item.setData(tempContainer, containerMinValueIndex);
           }
           if (maxChange) {
               tempContainer = item.getData()[item.getData().length -1 - counter];
               item.setData(containerMaxValue, item.getData().length -1 - counter);
               item.setData(tempContainer, containerMaxValueIndex);
           }
           minChange = false;
           maxChange = false;
       }

   }



   private void setData(E item,int index){
       this.item[index] = item;
   }


}
