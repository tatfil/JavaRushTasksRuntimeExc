package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object i = Integer.valueOf(42);
        String s = (String)i;
        System.out.println(s);
    }

    public void methodThrowsNullPointerException() {
        Integer integer = null;
        System.out.println(integer*2);

    }

    public static void main(String[] args) {
       VeryComplexClass veryComplexClass = new VeryComplexClass();

        try{
            veryComplexClass.methodThrowsClassCastException();
            veryComplexClass.methodThrowsNullPointerException();
        }
        catch(ClassCastException e){
            e.printStackTrace();
            System.out.println("class");
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("nullpointer");
        }

    }
}
