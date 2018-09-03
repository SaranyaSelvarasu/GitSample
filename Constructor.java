//Constructor code for Employee
class Employee
{
        int empid;
        String empName;
        int age;
        int salary;

        Employee()
        {
           System.out.println("Empty Constructor"); // Constructor without parameter
        }

        Employee(int empid,String empName,int age,int salary) //Constructor with parameter 
        {
                this.empid=empid;
                this.empName=empName;
                this.age=age;
                this.salary=salary;
        }

        void display()
        {
                System.out.println("EmployeeId:"+empid);
                System.out.println("EmployeeName:"+empName);
                System.out.println("Age:"+age);
                System.out.println("Salary:"+salary);
        }
}

public Main
{
        public static void main(String args[])
        {
                Employee employee=new Employee();
                Employee employee=new Employee(1,"saranya",22,200000);
                employee.display();
        }
}

