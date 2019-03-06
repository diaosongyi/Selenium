package test1;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		//定义一个数组
		Person[] person = new Person[2];
		
		for(int x = 0; x < person.length; x++){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入姓名");
			String name = sc.nextLine();
			System.out.println("请输入年龄");
			int age = sc.nextInt();
			Person p = new Person();
			p.setName(name);
			p.setAge(age);
			person[x] = p;
		}
		/*for(int x = 0; x < person.length; x++){
			System.out.println(person[x].toString());
		}*/
		for(int x = 0; x < person.length; x++){
			Person p = person[x];
			System.out.println(p.getAge()+ "---" + p.getName());
		}
		
	}

}
