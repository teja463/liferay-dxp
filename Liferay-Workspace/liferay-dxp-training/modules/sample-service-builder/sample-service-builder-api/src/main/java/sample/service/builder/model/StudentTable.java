/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package sample.service.builder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Collins_Student&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentTable extends BaseTable<StudentTable> {

	public static final StudentTable INSTANCE = new StudentTable();

	public final Column<StudentTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<StudentTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Integer> marks = createColumn(
		"marks", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Date> birthDate = createColumn(
		"birthDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private StudentTable() {
		super("Collins_Student", StudentTable::new);
	}

}