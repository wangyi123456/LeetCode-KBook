package baseTest.mytest;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Comparator compare = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;
                    return Double.compare(s2.getAvgScore(), s1.getAvgScore());
                }else {
                    throw new RuntimeException("类型不对");
                }
            }
        };
        ArrayList list = new ArrayList<Student>();
        list.add(new Student("张三", 29, 44, 98));
        list.add(new Student("李四", 60, 60, 60));
        list.add(new Student("王五", 100, 99, 98));
        list.add(new Student("赵六", 0, 0, 0));
        list.add(new Student("刘七", 0, 2, 3));
        System.out.println(new Student("刘七", 0, 2, 3).getAvgScore());
        list.add(new Student("楼八", 33, 22, 11));
        Collections.sort(list,compare);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Student stu = (Student) it.next();
            System.out.println(stu.getname());
        }
    }
}
