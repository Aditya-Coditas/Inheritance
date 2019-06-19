public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Department dept=new Department(1,"Comp Sci","Page");
        Department dept2=new Department(2,"Maths","Thakar");
        Static_Example s1=new Static_Example("Priya","128 nana peth","Adi","628 narayan",dept);
        Static_Example s2=new Static_Example("Pethe","1558 nana peth","Ron","Kothrud",dept2);
        Static_Example s[]=new Static_Example[6];
        for(int i=0;i<5;i++)
        {
            s[i]=new Static_Example("Priya","128 nana peth","Adi","628 narayan",dept);

        }
        s[5]=s2;
        int no_of_student_in_same_dept=Static_Example.noOfStudentUnderSameDepartment(s,"Maths");
        System.out.println("No of student in maths Department is "+no_of_student_in_same_dept);
        int no_of_student_in_same_dept1=Static_Example.noOfStudentUnderSameDepartment(s,"Comp Sci");
        System.out.println("No of student in Computer Science Department is "+no_of_student_in_same_dept1);
        System.out.println("---------------------------------------------------");
        dept.showDetails();
        //    s1.display();
        //  s2.display();
        //Static_Example.change();
        //s1.display();




    }
}
