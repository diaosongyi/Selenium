package test1;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		//����һ������
		Person[] person = new Person[2];
		
		for(int x = 0; x < person.length; x++){
			Scanner sc = new Scanner(System.in);
			System.out.println("����������");
			String name = sc.nextLine();
			System.out.println("����������");
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
