package by.academy.HomeWork2;

public class Finder {

    public void search(Integer mass[]){
        StringBuilder builder = new StringBuilder();
        int i = 0;
        int j = 0;
        int oddCounter = 0;

        builder.append(mass[0]+","); //поиск вариантов чисел, которые встречаются в массиве
        for (i = 1; i < mass.length; i++){
            if (!builder.toString().contains(mass[i].toString()+",")){
                builder.append(mass[i]+",");
            }
        }
      //  System.out.println(builder.substring(0,builder.length()-1)); //промежуточное значение вариантов чисел в массиве

        String[] strArr = String.valueOf(builder).split(","); // переводим строку с вариантами в массив чисел
        int[] numArr = new int[strArr.length];
        for (i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        Integer[] counter = new Integer[numArr.length]; //счётчик количества повторений числа
        for(i = 0; i < counter.length; i++){counter[i] = 0;} // NullPointerException

        for (i = 0; i < mass.length; i++){               //считает повторения
             for (j = 0; j < counter.length; j++){
                 if (numArr[j] == mass[i]) counter[j] += 1;
             }
        }
        for (i = 0; i < counter.length; i++){     //находт нечётное количество повторений
            if (counter[i]%2 == 1){
                oddCounter = i;
            }
        }
        System.out.println(numArr[oddCounter]);
        }
    }

