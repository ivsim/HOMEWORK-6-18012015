package lecture_exec_1_student;

public class Student {

	private String name;
	private String family;
	private int facNum;
	private String group;
	
	public Student(String name, String family, int facNum, String group){
		this.name = name;
		this.family = family;
		this.facNum = facNum;
		this.group = group;
	}
	
	//overriding toString...
	public String toString(){
		return "име: " + this.name + " | " + "фамилия: " + this.family + " - " + this.facNum + " - " + this.group;
	}
	
	
}
