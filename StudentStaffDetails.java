
class StudentStaffDetails {
   
   
    public static void main(String[] arg) 
    {
        Staff s1=new Staff();
        s1.print("pavis",45);
        s1.sta(1000);
        Student s2=new Student();
        s2.print("madesh", 19);
        s2.stu(9);
    }
    
}

class Human
{
    public void print(String a, int b)
    {
        System.out.println("Name:"+a);
        System.out.println("Age:"+b);
    }  

}
class Staff extends Human
{
    public void sta(int s)
    {
         System.out.println("Salary:"+s);
    }
}
class Student extends Human
{
    public void stu(int c)
    {
        System.out.println("cgb:"+c);
    }    
}
