package App112;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Main112 {

    public static void ShowList(LinkedList<Student> list) {
        for (Student s : list) {
            System.out.println(s.getName() + ": " + s.getPoint());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> list = new LinkedList<Student>();
        int n, dem = 0;
        System.out.println("Enter number of students: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter point: ");
            double point = Double.parseDouble(sc.nextLine());

            if (name.trim().length() > 0) {
                list.add(new Student(name, point));
            } else {
                System.out.println("Invalid name");
                return;
            }
        }
        System.out.println("List of students: ");
        ShowList(list);
        //
        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.getPoint() <= 5) {
                dem++;
                System.out.println("Student " + " is fail: " + "\n" + s.name + ": " + s.point);
            }
        }
        if (dem == 0) {
            System.out.println("No student has point <= 5");
        } else
            System.out.println("Number of students has point <= 5: " + dem);
        Iterator<Student> itr2 = list.iterator();
        while (itr2.hasNext()) {
            Student s = itr2.next();
            if (s.getPoint() >= 8) {
                System.out.println("Student have high point: " + "\n" + s.name + ": " + s.point);
                continue;
            }
        }
        //
        Iterator<Student> itr3 = list.iterator();
        System.out.println("Name of student need to find :");
        String name = sc.nextLine();
        while (itr3.hasNext()) {
            Student s = itr3.next();
            if (s.getName().equals(name)) {
                System.out.println("Student need to find: " + "\n" + s.name + ": " + s.point);
            }
        }

    }
}