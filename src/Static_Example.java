public class Static_Example extends Teacher {

    static int no;
    int roll_no;
    String name,address;
    static String col_name="Fergusson";

    static {
        no=10;
      }

    Static_Example(String teacher_name,String teacher_address,String name,String address,Department dept)
    {
        super(teacher_name,teacher_address,dept);
        roll_no=++no;
        this.name=name;
        this.address=address;

    }

    static void change()
    {
        col_name="modern";
    }

    void display()
    {
        super.display();
        System.out.println("Roll no is "+roll_no);
        System.out.println("name is "+name);
        System.out.println("Address is "+address);
        System.out.println("College name is "+col_name);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");


    }
    static int noOfStudentUnderSameDepartment(Static_Example s[],String d_name)
    {
        int c=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].dept.Dept_name==d_name)
            {
                c++;
            }
        }
        return c;
    }


}
