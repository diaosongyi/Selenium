package test1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 数组长度是固定是
 * 集合长度是可变的
 * @author DELL
 * 
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		
		//创建集合对象2
		Collection c = new ArrayList();
		
		//创建人对象
		Person p = new Person("zyx1",11);
		Person p2 = new Person("zyx2",22);
		Person p3 = new Person("zyx3",33);
		
		c.add(p);
		c.add(p2);
		c.add(p3);
		c.add(new Person("呵呵",23));//匿名对象
		
		
		Object[] objs1 = c.toArray();
		
		
		for(int x = 0; x< objs1.length; x++){
			System.out.println(objs1[x]);//objs1[x] 是一个object的数据类型
			//System.out.println(objs1[x]);
			Person pp = (Person) objs1[x];//向下转型
			System.out.println(pp.getAge() + "------" + pp.getName());
		}
		
		
		
		
	}

}
