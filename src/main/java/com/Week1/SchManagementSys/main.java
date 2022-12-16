package com.Week1.SchManagementSys;

import com.Week1.SchManagementSys.Example.School;
import com.Week1.SchManagementSys.Example.Student;
import com.Week1.SchManagementSys.Example.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class main {

	public static void main(String[] args) {
		Teacher Lizzy = new Teacher("Lizzy",5867, 5000);
		Teacher malisable = new Teacher("Malisable",232325, 10000);
		Teacher tom = new Teacher("Tom",68767, 8897);

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Lizzy);
		teacherList.add(malisable);
		teacherList.add(tom);




		Student tamasha = new Student("tamasha",68787,1);
		Student rascha = new Student("rascha",3434,2);
		Student Emmanual = new Student("Emmanual",46564,3);

		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rascha);
		studentList.add(Emmanual);



		School ghs = new School(teacherList,studentList);
		System.out.println(  "ghs as earn "  + ghs.getTotalMoneyEarn() + " money");

		// tamasha payfees






	}

}
