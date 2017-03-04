package com.ituple.design.nullobject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class NotNullChecker {

	public static List<String> validate(Object obj) {
		List<String> errors = new ArrayList<String>();
		Field[] fields = obj.getClass().getFields();
		for (int i = 0; i < fields.length; i++) {
			NotNull annotations = (NotNull) fields[i].getAnnotation(NotNull.class);
			if (annotations != null) {
				try {
					if (fields[i].get(obj) == null) {
						errors.add(((NotNull) annotations).message());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return errors;
	}
}
