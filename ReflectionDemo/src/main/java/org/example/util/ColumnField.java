package org.example.util;

import java.lang.reflect.Field;

/**
 * Created by rishi on 27/07/2021
 */
public class ColumnField {
    private Field field;

    public ColumnField(Field field) {

        this.field = field;
    }

    public String getName() {
        return field.getName();
    }

    public Class<?> getType() {
        return field.getType();
    }
}
