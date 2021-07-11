package org.paumard.reflection;

import java.util.List;

import org.paumard.reflection.model.Person;
import org.paumard.reflection.util.ColumnField;
import org.paumard.reflection.util.Metamodel;
import org.paumard.reflection.util.PrimaryKeyField;

public class PlayWithMetamodel {
	
	public static void main(String... args) {
		
		Metamodel<Person> metamodel = Metamodel.of(Person.class);
		
		PrimaryKeyField primaryKeyField = metamodel.getPrimaryKey();
		List<ColumnField> columnFields = metamodel.getColumns();
		
		System.out.println("Primary key name = " + primaryKeyField.getName() + 
				", type = " + primaryKeyField.getType().getSimpleName());
		
		for (ColumnField columnField : columnFields) {
			System.out.println("Colum name = " + columnField.getName() + 
					", type = " + columnField.getType().getSimpleName());
		}
	}
}
