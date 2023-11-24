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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentWrapper
	extends BaseModelWrapper<Student>
	implements ModelWrapper<Student>, Student {

	public StudentWrapper(Student student) {
		super(student);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("marks", getMarks());
		attributes.put("address", getAddress());
		attributes.put("birthDate", getBirthDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer marks = (Integer)attributes.get("marks");

		if (marks != null) {
			setMarks(marks);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Date birthDate = (Date)attributes.get("birthDate");

		if (birthDate != null) {
			setBirthDate(birthDate);
		}
	}

	@Override
	public Student cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this student.
	 *
	 * @return the address of this student
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the birth date of this student.
	 *
	 * @return the birth date of this student
	 */
	@Override
	public Date getBirthDate() {
		return model.getBirthDate();
	}

	/**
	 * Returns the ID of this student.
	 *
	 * @return the ID of this student
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the marks of this student.
	 *
	 * @return the marks of this student
	 */
	@Override
	public int getMarks() {
		return model.getMarks();
	}

	/**
	 * Returns the name of this student.
	 *
	 * @return the name of this student
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this student.
	 *
	 * @return the uuid of this student
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this student.
	 *
	 * @param address the address of this student
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the birth date of this student.
	 *
	 * @param birthDate the birth date of this student
	 */
	@Override
	public void setBirthDate(Date birthDate) {
		model.setBirthDate(birthDate);
	}

	/**
	 * Sets the ID of this student.
	 *
	 * @param id the ID of this student
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the marks of this student.
	 *
	 * @param marks the marks of this student
	 */
	@Override
	public void setMarks(int marks) {
		model.setMarks(marks);
	}

	/**
	 * Sets the name of this student.
	 *
	 * @param name the name of this student
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this student.
	 *
	 * @param uuid the uuid of this student
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected StudentWrapper wrap(Student student) {
		return new StudentWrapper(student);
	}

}