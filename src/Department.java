public class Department implements Department_details {
    int Dept_no;
    String Dept_name,Dept_head;
    Department(int Dept_no,String Dept_name,String Dept_head)
    {
        this.Dept_no=Dept_no;
        this.Dept_name=Dept_name;
        this.Dept_head=Dept_head;
    }

    @Override
    public void showDetails() {
        System.out.println("The Principal name is :"+Principal);
        System.out.println("The Vice Principal name is :"+Vice_Principal);
        System.out.println("The Department no is :"+Dept_no);
        System.out.println("The Department name is :"+Dept_name);
        System.out.println("The Department head is :"+Dept_head);




    }
}
