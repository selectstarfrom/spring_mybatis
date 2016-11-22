package com.frz.springmybatis.core.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Options.FlushCachePolicy;
import org.apache.ibatis.annotations.Select;

import com.frz.springmybatis.core.entity.Student;

/**
 * @author syed
 *
 */
public interface StudentMapper {
	@Insert("INSERT INTO student(userName, password, firstName," + "lastName, dateOfBirth, emailAddress) VALUES"
			+ "(#{userName},#{password}, #{firstName}, #{lastName}," + "#{dateOfBirth}, #{emailAddress})")
	@Options(useGeneratedKeys = true, keyProperty = "id", flushCache = FlushCachePolicy.TRUE, keyColumn = "id")
	public void insertStudent(Student student);

	@Select("SELECT USERNAME as userName, PASSWORD as password, " + "FIRSTNAME as firstName, LASTNAME as lastName, "
			+ "DATEOFBIRTH as dateOfBirth, EMAILADDRESS as emailAddress " + "FROM student WHERE userName = #{userName}")
	public Student getStudentByUserName(String userName);

}