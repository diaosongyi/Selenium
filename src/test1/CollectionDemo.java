package test1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���鳤���ǹ̶���
 * ���ϳ����ǿɱ��
 * @author DELL
 * 
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		
		//�������϶���2
		Collection c = new ArrayList();
		
		//�����˶���
		Person p = new Person("zyx1",11);
		Person p2 = new Person("zyx2",22);
		Person p3 = new Person("zyx3",33);
		
		c.add(p);
		c.add(p2);
		c.add(p3);
		c.add(new Person("�Ǻ�",23));//��������
		
		
		Object[] objs1 = c.toArray();
		
		
		for(int x = 0; x< objs1.length; x++){
			System.out.println(objs1[x]);//objs1[x] ��һ��object����������
			//System.out.println(objs1[x]);
			Person pp = (Person) objs1[x];//����ת��
			System.out.println(pp.getAge() + "------" + pp.getName());
		}
		
		
		
		
	}

}
