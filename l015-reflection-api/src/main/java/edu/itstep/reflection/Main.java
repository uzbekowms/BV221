package edu.itstep.reflection;

import edu.itstep.reflection.annotation.Column;
import edu.itstep.reflection.model.Car;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
//        Class<?> aClass = Class.forName("edu.itstep.reflection.model.Car");


//        Car car = new Car();
//
//        Class<? extends Car> aClass = car.getClass();
//        Class<Car> carClass = Car.class;
//        carClass.getDeclaredFields();
//        carClass.getDeclaredField("");
//        carClass.getFields("");
//        carClass.getField("");
//          =====================1=========================
//        Field[] declaredFields = carClass.getDeclaredFields();
//        for (Field field : declaredFields) {
//            System.out.println(field);
//        }
//          =====================2=========================

//        try {
//            Field horsepowerField = carClass.getDeclaredField("horsepowerField");
//            System.out.println(horsepowerField);
//            carClass.getDeclaredField("asdas");
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        }

//          =====================3=========================

//        Field[] fields = carClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

//        try {
//            Field horsepowerField = carClass.getField("serialNumber");
//            System.out.println(horsepowerField);
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        }
//        carClass.getDeclaredMethods()
//        carClass.getDeclaredMethod("")
//        carClass.getMethod("")
//        carClass.getMethods()

//        Method[] declaredMethods = carClass.getDeclaredMethods();
//        for (Method method : declaredMethods) {
//            System.out.println(method);
//        }
//
//        try {
//            Method declaredMethod = carClass.getDeclaredMethod("setHorsepower", int.class);
//            System.out.println(declaredMethod);
//
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        Car car = new Car() {
//
//            @Override
//            public void printSerialNumber() {
//
//            }
//        };
//
//        Method enclosingMethod = car.getClass().getEnclosingMethod();
//        System.out.println(enclosingMethod);
//        Car car = new Car(500, "123");
//        Class<? extends Car> carClass = car.getClass();
//        try {
//            Field serialNumberField = carClass.getDeclaredField("serialNumber");
//            serialNumberField.setAccessible(true);
//            String serialNumber = (String) serialNumberField.get(car);
//            System.out.println(serialNumber);
//
//            serialNumberField.set(car, "456");
//            System.out.println(car.getSerialNumber());
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//        Car car = new Car(500, "123");
//        Class<? extends Car> aClass = car.getClass();
//
//        Field horsepowerField = aClass.getDeclaredField("horsepower");
//
//        System.out.println(horsepowerField.getName());
//        System.out.println(horsepowerField.getType());
//        System.out.println(horsepowerField.getModifiers());
//        System.out.println(aClass.getDeclaredField("serialNumber").getModifiers());
//        System.out.println(Modifier.isFinal(horsepowerField.getModifiers()));
//        System.out.println(Modifier.isPrivate(horsepowerField.getModifiers()));
//        horsepowerField.getAnnotations();
//        horsepowerField.getDeclaredAnnotations();
//        horsepowerField.getAnnotationsByType();
//        horsepowerField.getDeclaredAnnotationsByType();
//        horsepowerField.getAnnotation();
//        horsepowerField.getDeclaredAnnotation();
        Car car = new Car(500, "123");
        Class<? extends Car> carClass = car.getClass();

        Field serialNumberField = carClass.getDeclaredField("serialNumber");

        System.out.println(serialNumberField.getAnnotation(Column.class).value());

        Method declaredMethod = carClass.getDeclaredMethod("setHorsepower", int.class);
//        declaredMethod.invoke()


        //getAnnotations()
        //getAnnotation()
        //getAnnotationsByType()
    }
}
