import java.util.Arrays;

public class Main {
    private static int changeValueInt(int value1) {
        value1 = 22;
        System.out.println("Значение переменной int в методе:" + value1);
        return value1;
    }

    private static Integer changeValueInteger(Integer value2) {
        value2 = 22;
        System.out.println("Значение переменной Integer в методе:" + value2);
        return value2;
    }

    public static void changeValueIntegerArray(Integer[] value3) {
//        value3[0] = 1;
//        value3[1] = 2;
        Integer[] valueArray = {1, 2};
        System.out.println("Значение переменных в массиве Integer в методе:" + Arrays.toString(valueArray));
    }

    public static void changeValueIntegerArrayFirst(Integer[] value3) {
        value3[0] = 99;
        System.out.println("Значение переменных в массиве Integer в методе:" + Arrays.toString(value3));
    }

    public static void changePerson(Person person) {
        Person person1 = new Person("Ilya", "lagutenko");
    }

    public static void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    public static void main(String[] args) {
        int valueInt = 33;
        Integer valueInteger = 33;
        System.out.println("Значение переменной int до вызова метода: " + valueInt);
        System.out.println(changeValueInt(valueInt));
        System.out.println("Значение переменной int после вызова метода: " + valueInt);
        System.out.println();

        System.out.println("Значение переменной Integer до вызова метода: " + valueInteger);
        System.out.println(changeValueInteger(valueInteger));
        System.out.println("Значение переменной Integer после вызова метода: " + valueInteger);
        System.out.println();

        Integer[] valueArray = {3, 4};
        System.out.println("Значение переменных в массиве Integer до вызова метода: " + Arrays.toString(valueArray));
        changeValueIntegerArray(valueArray);
        System.out.println("Значение переменных в массиве Integer после вызова метода: " + Arrays.toString(valueArray));
        System.out.println();
        System.out.println("Значение переменных в массиве Integer до вызова метода: " + Arrays.toString(valueArray));
        changeValueIntegerArrayFirst(valueArray);
        System.out.println("Значение переменных в массиве Integer после вызова метода: " + Arrays.toString(valueArray));
        System.out.println();

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);
        changePerson2(person);
        System.out.println(person);


    }
}