package model;

class Student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private String name;
	private int age;
	private String sex;
	private int number;
}

//public class Demo{
//	public static void main(String[] args) {
//		Student student = new Student();
//		student.setAge(18);
//		student.setName("杨洁");
//		student.setNumber(0017);
//		student.setSex("男");
//		System.out.println(
//				student.getName()
//				+student.getSex()
//				+student.getNumber()
//				+student.getAge());
//	}
//}
