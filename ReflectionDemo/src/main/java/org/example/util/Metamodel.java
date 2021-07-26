package org.example.util;

import java.util.List;

/**
 * Created by rishi on 27/07/2021
 */
public class Metamodel<T> {

    private final Class<T> clss;

    public static <T> Metamodel<T> of(Class<T> clss) {
        return new Metamodel<>(clss);
    }

    public Metamodel(Class<T> clss) {
        this.clss = clss;
    }

    public PrimaryKeyField getPrimaryKey() {
        return null;
    }

    public List<ColumnField> getColumns() {
        return null;
    }
}
