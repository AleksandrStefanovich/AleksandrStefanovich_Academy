package by.academy.HomeWork4;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<E> {

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
