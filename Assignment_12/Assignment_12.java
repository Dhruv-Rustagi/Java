package Assignment_12;
import java.util.*;

class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int year_of_enrolment;
    double percentage_till_date;

    Student(int id1, String name1, int age1, String gender1, String engDepartment1, int year_of_enrolment1, double percentage_till_date1)
    {
        id = id1;
        name = name1;
        age = age1;
        gender = gender1;
        engDepartment = engDepartment1;
        year_of_enrolment = year_of_enrolment1;
        percentage_till_date = percentage_till_date1;
    }
}
public class Assignment_12 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println();

        // query 1
        Set<String> set = new HashSet<>();
        for(Student s : list)
        {
            set.add(s.engDepartment);
        }
        System.out.println("Name of all departments in college : ");
        for(String str : set)
        {
            System.out.print(str + "  ");
        }

        System.out.println();
        System.out.println();

        //query 2

        System.out.println("Name of students who enrolled after 2018 : ");
        for(Student s : list)
        {
            if(s.year_of_enrolment > 2018)
            {
                System.out.print(s.name + "  ");
            }
        }

        System.out.println();
        System.out.println();

        // query 3

        System.out.println("Details of all male students in Computer Science department : ");
        for(Student s : list)
        {
            if(s.gender.equals("Male") && s.engDepartment.equals("Computer Science"))
            {
                System.out.println("Name : " + s.name + " , Id : " + s.id + " , Age : " + s.age + " , Gender : " + s.gender +
                        " , Engineering Department : " +  s.engDepartment + " , Year of enrollment : " + s.year_of_enrolment +
                        " ,and percentage till date : " + s.percentage_till_date);
            }
        }

        System.out.println();


    }
}
