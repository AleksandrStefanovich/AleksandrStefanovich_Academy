package by.academy.HomeWork4;


import java.util.Arrays;

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

   public static void sort(DataContainer<Person> item, PersonRegistrationComparator comp){
       Person tempContainer;
       int personMaxDateIndex = 0;   //обе сортировки вместо перестановки объектов местами
       int personMinDateIndex = 0;   //обменивают ссылки на объекты
       Person personMaxDate;
       Person personMinDate;
       boolean maxChange = false;
       boolean minChange = false;

       for (int counter = 0; counter < item.getData().length/2; counter++) {

           personMaxDate = item.getData()[counter];  //каждую итерацию находятся мин и макс
           personMinDate = item.getData()[counter];  //и обмениваются ссылками с крайними элементами
                                                     //продвигаясь от краёв массива к центру
           for (int i = counter; i < item.getData().length-counter; i++) {
               if (comp.compare(personMaxDate, item.getData()[i]) == 1) {
                   personMaxDate = item.getData()[i];
                   personMaxDateIndex = i;
                   maxChange = true;
               }
               if (comp.compare(personMinDate, item.getData()[i]) == -1) {
                   personMinDate = item.getData()[i];
                   personMinDateIndex = i;
                   minChange = true;
               }
           }
           if (minChange) {   //проверка на случай если элемент на своём месте
           tempContainer = item.getData()[counter];
           item.setData(personMinDate, counter);
           item.setData(tempContainer, personMinDateIndex);
           }
           if (maxChange) {
               tempContainer = item.getData()[item.getData().length -1 - counter];
               item.setData(personMaxDate, item.getData().length -1 - counter);
               item.setData(tempContainer, personMaxDateIndex);
           }
           minChange = false;
           maxChange = false;
       }

   }

    //метод фактически дублирует метод sort() для Person
   public static void sort(DataContainer<Animal> item , AnimalAgeComparator comp){
       Animal tempContainer;
       int animalMaxAgeIndex = 0;
       int animalMinAgeIndex = 0;
       Animal animalMaxAge;
       Animal animalMinAge;
       boolean maxChange = false;
       boolean minChange = false;

       for (int counter = 0; counter < item.getData().length/2; counter++) {

           animalMaxAge = item.getData()[counter];
           animalMinAge = item.getData()[counter];

           for (int i = counter; i < item.getData().length-counter; i++) {
               if (comp.compare(animalMaxAge, item.getData()[i]) == 1) {
                   animalMaxAge = item.getData()[i];
                   animalMaxAgeIndex = i;
                   maxChange = true;
               }
               if (comp.compare(animalMinAge, item.getData()[i]) == -1) {
                   animalMinAge = item.getData()[i];
                   animalMinAgeIndex = i;
                   minChange = true;
               }
           }
           if (minChange) {
               tempContainer = item.getData()[counter];
               item.setData(animalMinAge, counter);
               item.setData(tempContainer, animalMinAgeIndex);
           }
           if (maxChange) {
               tempContainer = item.getData()[item.getData().length - 1 - counter];
               item.setData(animalMaxAge, item.getData().length - 1 - counter);
               item.setData(tempContainer, animalMaxAgeIndex);
           }
           minChange = false;
           maxChange = false;
       }
   }

   private void setData(E item,int index){
       this.item[index] = item;
   }


}
