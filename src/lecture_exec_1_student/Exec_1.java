package lecture_exec_1_student;

import java.util.ArrayList;

public class Exec_1 {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();
		
		Student s1 = new Student("Иван", "Петров", 6944, "2-ра група");
		Student s2 = new Student("Стоян", "Стоянов", 7012, "3-та група");
		Student s3 = new Student("Петър", "Костадинов", 7022, "2-ра група");
		Student s4 = new Student("Николай", "Давидов", 7029, "2-ра група");
		Student s5 = new Student("Здравка", "Маринова", 7045, "1-ва група");
			
		studentList.add(s1.toString());
		studentList.add(s2.toString());
		studentList.add(s3.toString());
		studentList.add(s4.toString());
		studentList.add(s5.toString());
		
		for (String x: studentList){
			System.out.println(x);
		}
		
		
		
		
	}

}
