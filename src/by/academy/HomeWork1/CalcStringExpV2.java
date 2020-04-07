package by.academy.HomeWork1;

public class CalcStringExpV2 {
    private StringBuilder fullExpression = new StringBuilder();
    private ICalculator calc = new CalculatorWithMath();
    private String operators = "+-*/|^";


    public double calculateExpression(String str) {
        fullExpression.append(formatExpression(str));
        if (checkExpression(str) == false) {
            System.out.println("Неверное выражение");
            return 0;
        }
        return workOnExpression(fullExpression);
    }
    private double workOnExpression(StringBuilder str) {
        int reverseCheck = 0;
        double result = 0;
        int i = 0;
        int j = 0;

        while (str.toString().contains("(")) { countBrackets(str); }
        while (str.toString().contains("^")) { countPower(str); }
        while (str.toString().contains("*")) { countMult(str); }
        while (str.toString().contains("/")) { countDiv(str); }
        if (str.charAt(0) == '-') {
            for (i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                    result = Double.parseDouble(str.substring(0, i));
                    break;
                }
                if (i == str.length() - 1) {
                    return Double.parseDouble(str.substring(0, i));
                }
            }
        } else {
                for (i = 1; i < str.length(); i++) {
                    if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                        result = Double.parseDouble(str.substring(0, i));
                        break;
                    }
                    if (i == str.length() - 1) {
                        return Double.parseDouble(str.substring(0, i+1));
                    }
                }
            }
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                for (j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '-' || str.charAt(j) == '+') {
                        result -= Double.parseDouble(str.substring(i+1, j+1));
                        break;
                    } else if(j == str.length()-1){
                        result -= Double.parseDouble(str.substring(i+1, j+1));}
                }
            }
        }
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                for (j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '-' || str.charAt(j) == '+') {
                        String debug = str.substring(i+1, j);
                        result += Double.parseDouble(str.substring(i+1, j));
                        break;
                    } else if(j == str.length()-1){ result += Double.parseDouble(str.substring(i+1, j+1));}
                }
            }
        }


            return result;
    }



    private void countBrackets(StringBuilder str) {
        int bracketsCounter = 0;
        int i = 0;
        StringBuilder subExpression = new StringBuilder();
        StringBuilder subToSend = new StringBuilder();
        subToSend.delete(0,subToSend.length());
        subExpression.delete(0, subExpression.length());
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                subExpression.append(str.substring(i+1));
                str.delete(i, str.length());
                bracketsCounter++;
                break;
            }}

        for (i = 0; i < subExpression.length(); i++){
            if (subExpression.charAt(i) == '('){bracketsCounter++;}
            if (subExpression.charAt(i) == ')'){
                bracketsCounter--;
                if (bracketsCounter == 0){
                    subToSend.append(subExpression.substring(0,i));
                    subExpression.delete(0, i+1);
                    workOnExpression(subToSend); // на этом моменте в subToSend 5.6 эту строку добавил для проверки значения
                    subToSend.replace(0 , subToSend.length(),  String.valueOf(workOnExpression(subToSend))); // тут становится 5.0
                    break;
                }

            }
        }
        if (str.charAt(str.length()-1) == '+' && subToSend.charAt(0) == '-'){
            str.delete(str.length()-1,str.length());
        }
        if (str.charAt(str.length()-1)=='-'&&subToSend.charAt(0)=='-'){
            str.delete(str.length()-2,str.length()-1);
            str.append("+");
            subToSend.deleteCharAt(0);
        }

        str.append(subToSend);
        str.append(subExpression);
        workOnExpression(str);
    }

    private void countPower(StringBuilder str){
        int a = str.indexOf("^");
        int b = 0;
        int counter = 0;
        String str1 = str.substring(0,a);
        String str2 = str.substring(a+1);
        for (int i = str1.length()-1; i>=0; i--){
            counter++;
            if (operators.contains(str1.charAt(i)+"")){
                a = i+1; break;
            }else a = 0;
        }
        for (int i = 0; i < str2.length();i++){
            if  (operators.contains(str2.charAt(i)+"")){
                b = a + i + counter; break;
            }else{b = a + str2.length() + counter;}
        }
        String str3 = str.substring(a,b);
        str.replace(a,b,countOperation(str.substring(a,b)));
    }

    private void countMult(StringBuilder str) {
        int a = str.indexOf("*");
        int b = 0;
        int counter = 0;
        String str1 = str.substring(0,a);
        String str2 = str.substring(a+1);
        for (int i = str1.length()-1; i>=0; i--){
            counter++;
            if (operators.contains(str1.charAt(i)+"")){     //проверки на случай, если число находится в начале или конце строки
                a = i+1; break;                             //т.е. не окружены символами
            }else a = 0;
        }
        for (int i = 0; i < str2.length();i++){
            if  (operators.contains(str2.charAt(i)+"")){
                b = a + i + counter; break;
            }else{if (a==0){b = 1 + str2.length() + counter;}else
                b = a + str2.length() + counter;}
        }
        String str3 = str.substring(a,b);
        str.replace(a,b,countOperation(str.substring(a,b)));

    }

    private void countDiv(StringBuilder str){
        int a = str.indexOf("/");
        int b = 0;
        int counter = 0;
        String str1 = str.substring(0,a);
        String str2 = str.substring(a+1);
        for (int i = str1.length()-1; i>=0; i--){
            counter++;
            if (operators.contains(str1.charAt(i)+"")){
                a = i+1; break;
            }else a = 0;
        }
        for (int i = 0; i < str2.length();i++){
            if  (operators.contains(str2.charAt(i)+"")){
                b = a + i + counter; break;
            }else{if (a==0){b = 1 + str2.length() + counter;}else
                b = a + str2.length() + counter;}
        }
        String str3 = str.substring(a,b);
        str.replace(a,b,countOperation(str.substring(a,b)));
    }



    private String countOperation(String c){     //подсчёт выражения внутри переданной строки из двух чисел и символа
        double a;
        double b;

        if (c.contains("+")){
            a = Double.parseDouble(c.substring(0,c.indexOf('+')));
            b = Double.parseDouble(c.substring(c.indexOf('+')+1,c.length()));
            return String.valueOf(calc.add(a,b));
        }
        if (c.contains("-")){
            a = Double.parseDouble(c.substring(0,c.indexOf('-')));
            b = Double.parseDouble(c.substring(c.indexOf('-')+1,c.length()));
            return String.valueOf(calc.subtract(a,b));
        }
        if (c.contains("*")){
            a = Double.parseDouble(c.substring(0,c.indexOf('*')));
            b = Double.parseDouble(c.substring(c.indexOf('*')+1,c.length()));
            return String.valueOf(calc.multiply(a,b));
        }
        if (c.contains("/")){
            a = Double.parseDouble(c.substring(0,c.indexOf('/')));
            b = Double.parseDouble(c.substring(c.indexOf('/')+1,c.length()));
            return String.valueOf(calc.divide(a,b));
        }
        if (c.contains("^")){
            a = Double.parseDouble(c.substring(0,c.indexOf('^')));
            b = Double.parseDouble(c.substring(c.indexOf('^')+1,c.length()));
            return String.valueOf(calc.square(a,b));
        }
        if (c.contains("|")){
            a = Double.parseDouble(c.substring(0,c.length()));
            return String.valueOf(calc.modulus(a));

        }else{return "";}
    }




    private String formatExpression(String stre) {
        String strpi = stre.replaceAll("PI", String.valueOf(Math.PI)); //заменяем пи и е на цифры
        String str = strpi.replaceAll("E", String.valueOf(Math.E));
        return str.replaceAll(" ", ""); //убираем пробелы при наличии
    }

    private boolean checkExpression(String str) {
        if (operators.contains(str.charAt(str.length() - 1) + "")) { //проверяем законченность выражения
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (operators.contains(str.charAt(i) + "") ||"0.123456789 ()".contains(str.charAt(i) + "")) {
                //проверяем все ли символы цифры и знаки
            } else {
                return false;
            }
        }
    return true;
    }

}