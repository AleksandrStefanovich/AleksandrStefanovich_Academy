package by.academy.HomeWork1;

public class CalculatorStringExpression {
    private StringBuilder builder = new StringBuilder();
    private ICalculator calc = new CalculatorWithMath();
    private String operators = "+-*/|";

    public double calculateExpression(String str){
        int reverseCheck = 0;

        builder.append(str.replaceAll(" ",""));
        
        if (operators.contains(str.charAt(str.length()-1)+"")){
            System.out.println("Неверное выражение");
            return 0;}


        while (builder.toString().contains("(")){ findAndCountInBrackets();}
        while (builder.toString().contains("^")){ findAndCountPower(); }
        while (builder.toString().contains("|")){ findAndCountModulus(); }
        while (builder.toString().contains("*")){ findAndCountMult(); }
        while (builder.toString().contains("/")){ findAndCountDiv(); }
        while (builder.toString().contains("-")){
            if (builder.charAt(0)=='-'&& builder.toString().contains("+")){
             builder.deleteCharAt(0);
             int plusCounter = builder.indexOf("+");
             builder.replace(plusCounter,plusCounter+1,"-");
             reverseCheck=1;
            }
            else if (builder.charAt(0)=='-'&& builder.lastIndexOf("-")!= 0){
                builder.deleteCharAt(0);
                int minusCounter = builder.indexOf("-");
                builder.replace(minusCounter,minusCounter+1,"+");
                reverseCheck=1;
                findAndCountPlus(); break;
            }
            else if (builder.charAt(0)=='-'){
                System.out.println(builder);
                return Double.parseDouble(String.valueOf(builder));



            }
            else findAndCountMinus(); }
        while (builder.toString().contains("+")){ findAndCountPlus(); }


        System.out.println(builder);
    if (reverseCheck == 1){
        return -Double.parseDouble(String.valueOf(builder));}
    else{
        return Double.parseDouble(String.valueOf(builder));}
    }
    private void findAndCountInBrackets(){
        int a; int b;
        String c;
       a = builder.indexOf("(");
       b = builder.indexOf(")");
       c = builder.substring(a + 1,b);
       builder.replace(a,b+1,countOperation(c));
      }
    private void findAndCountPower(){
        int a = builder.indexOf("^");
        int b = 0;
        int counter = 0;
        String str1 = builder.substring(0,a);
        String str2 = builder.substring(a+1);
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
String str3 = builder.substring(a,b);
        builder.replace(a,b,countOperation(builder.substring(a,b)));
    }
    private void findAndCountModulus(){
        int a; int b; double d;
        String c;
        a = builder.indexOf("|");
        b = builder.lastIndexOf("|");
        c = builder.substring(a+1,b);
        if (Double.parseDouble(c) < 0) d = calc.modulus(Double.parseDouble(c));
        else d = Double.parseDouble(c);

        builder.replace(a,b+1,String.valueOf(d));

    }

    private void findAndCountMult() {
        int a = builder.indexOf("*");
        int b = 0;
        int counter = 0;
        String str1 = builder.substring(0,a);
        String str2 = builder.substring(a+1);
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
        String str3 = builder.substring(a,b);
        builder.replace(a,b,countOperation(builder.substring(a,b)));

    }

    private void findAndCountDiv() {
        int a = builder.indexOf("/");
        int b = 0;
        int counter = 0;
        String str1 = builder.substring(0,a);
        String str2 = builder.substring(a+1);
        for (int i = str1.length()-1; i>=0; i--){
            counter++;
            if (operators.contains(str1.charAt(i)+"")){
                a = i+1; break;
            }else a = 0;
        }
        for (int i = 0; i < str2.length();i++){
            if  (operators.contains(str2.charAt(i)+"")){
                b = a + i + counter+1; break;
            }else{b = a + str2.length() + counter;}
        }
        String str3 = builder.substring(a,b);
        builder.replace(a,b,countOperation(builder.substring(a,b)));


    }
    private void findAndCountPlus() {
        int a = builder.indexOf("+");
        int b = 0;
        int counter = 0;
        String str1 = builder.substring(0,a);
        String str2 = builder.substring(a+1);
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
        String str3 = builder.substring(a,b);
        builder.replace(a,b,countOperation(builder.substring(a,b)));


    }
    private void findAndCountMinus() {
        int a = builder.indexOf("-");
        int b = 0;
        int counter = 0;

        String str1 = builder.substring(0,a);
        String str2 = builder.substring(a+1);
        for (int i = str1.length()-1; i>=0; i--){
            counter++;
            if (operators.contains(str1.charAt(i)+"")){
                a = i+1; break;
            }else a = 0;
        }
        for (int i = 0; i < str2.length();i++){
            if  (operators.contains(str2.charAt(i)+"")){
                b = a + i + counter+1; break;
            }else{b = a + str2.length() + counter+1;}
        }
        String str3 = builder.substring(a,b);
        builder.replace(a,b,countOperation(builder.substring(a,b)));


    }











    private String countOperation(String c){
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

}
