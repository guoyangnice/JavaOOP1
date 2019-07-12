package model;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(18);
		student.setName("杨洁");
		student.setNumber(161);
		student.setSex("男");
		System.out.println(
				student.getName()
				+"，性别"+student.getSex()
				+"，学号"+student.getNumber()
				+"，年龄"+student.getAge());
	}

}
