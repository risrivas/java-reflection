package org.paumard.reflection.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.paumard.reflection.annotation.Column;
import org.paumard.reflection.annotation.PrimaryKey;

public class Metamodel<T> {


	private Class<T> clss;

	public static <T> Metamodel<T> of(Class<T> clss) {
		return new Metamodel<>(clss);
	}

	public Metamodel(Class<T> clss) {
		this.clss = clss;
	}

	public PrimaryKeyField getPrimaryKey() {
		
		Field[] fields = clss.getDeclaredFields();
		for (Field field : fields) {
			
			PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
			if (primaryKey != null) {
				PrimaryKeyField primaryKeyField = new PrimaryKeyField(field);
				return primaryKeyField;
			}
		}
		
		throw new IllegalArgumentException("No primary key found in class " + clss.getSimpleName());
	}

	public List<ColumnField> getColumns() {
		
		List<ColumnField> columnFields = new ArrayList<>();
		Field[] fields = clss.getDeclaredFields();
		for (Field field : fields) {
			
			Column column = field.getAnnotation(Column.class);
			if (column != null) {
				ColumnField columnField = new ColumnField(field);
				columnFields.add(columnField);
			}
		}
		return columnFields;
	}
}
