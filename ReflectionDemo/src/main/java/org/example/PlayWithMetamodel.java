package org.example;

import org.example.model.Person;
import org.example.util.ColumnField;
import org.example.util.Metamodel;
import org.example.util.PrimaryKeyField;

import java.util.List;

/**
 * Created by rishi on 27/07/2021
 */
public class PlayWithMetamodel {

    public static void main(String[] args) {
        Metamodel metamodel = Metamodel.of(Person.class);

        PrimaryKeyField primaryKeyField = metamodel.getPrimaryKey();
        System.out.println("Primary key name = " + primaryKeyField.getName() + ", type = "
                + primaryKeyField.getType().getSimpleName());

        List<ColumnField> columnFields = metamodel.getColumns();

        for (ColumnField columnField :
                columnFields) {
            System.out.println("Column name = " + columnField.getName() + ", type = "
                    + columnField.getType().getSimpleName());
        }

    }

}
