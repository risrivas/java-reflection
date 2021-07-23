package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by rishi on 24/07/2021
 */
public class PlayWithReflection {

    public static void main(String[] args) throws ClassNotFoundException {
        String personClassName = "org.example.model.Person";
        Class<?> personClass = Class.forName(personClassName);

        System.out.println("Person class = " + personClass);

        Field[] fields = personClass.getFields();
        System.out.println("Fields: ");
        System.out.println(Arrays.toString(fields)); // only public fields should be printed

        Field[] declaredFields = personClass.getDeclaredFields();
        System.out.println("Declared Fields: ");
        System.out.println(Arrays.toString(declaredFields));

        Method[] methods = personClass.getMethods();
        System.out.println("Methods: ");
        Arrays.stream(methods).forEach(System.out::println);

        Method[] declaredMethods = personClass.getDeclaredMethods();
        System.out.println("\nDeclared Methods: ");
        Arrays.stream(declaredMethods).forEach(System.out::println);

        // Print all static methods only
        System.out.println("\nOnly static methods: ");
        Arrays.stream(declaredMethods)
                .filter(m -> Modifier.isStatic(m.getModifiers()))
                .forEach(System.out::println);

    }
}
