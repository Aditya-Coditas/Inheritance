public class Teacher {
 String teacher_name,teacher_address;
 Department dept;

     Teacher(String teacher_name,String teacher_address,Department dept)
     {
         this.teacher_name=teacher_name;
         this.teacher_address=teacher_address;
         this.dept=dept;
     }

     void display()
     {
         System.out.println("Deparrtment No "+dept.Dept_no);
         System.out.println("Deparrtment Name "+dept.Dept_name);
         System.out.println("Deparrtment Head "+dept.Dept_head);
         System.out.println("--------------------------------------");
         System.out.println("Teacher name is "+teacher_name);
         System.out.println("Teacher address is "+teacher_address);
         System.out.println("--------------------------------------");

     }


}