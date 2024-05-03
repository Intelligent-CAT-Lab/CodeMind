import java.util.*;
import java.lang.*;

class Main {
    // Set max recursion limit
    static {
        java.lang.reflect.Field field = null;
        try {
            field = java.lang.reflect.Field.class.getDeclaredField("modifiers");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        try {
            field.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        java.lang.reflect.Method method = null;
        try {
            method = java.lang.reflect.Method.class.getDeclaredMethod("setAccessible0", boolean.class);
            method.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            method.invoke(field, true);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            field.setInt(field, field.getModifiers() | java.lang.reflect.Modifier.FINAL);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    // Debug output
    static void chkprint(Object... args) {
        Map<Integer, String> names = new HashMap<>();
        for (Map.Entry<String, Integer> entry : Thread.currentThread().getStackTrace()[2].getMethodName().entrySet()) {
            names.put(entry.getValue(), entry.getKey());
        }
        System.out.println(Arrays.stream(args).map(arg -> names.getOrDefault(System.identityHashCode(arg), "???") + " = " + arg.toString()).collect(Collectors.joining(", ")));
    }

    // Binary converter
    static String to_bin(int x) {
        return