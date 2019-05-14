package com.hebaibai.jdbcplus;

public class Assert {

    public static void notNull(Object object) {
        if (object == null) {
            throw new RuntimeException("object is not null");
        }
    }

    public static void notNull(Object object, String msg) {
        if (object == null) {
            throw new RuntimeException(msg);
        }
    }

    public static void isTrue(boolean b, String msg) {
        if (!b) {
            throw new RuntimeException(msg);
        }
    }
}
