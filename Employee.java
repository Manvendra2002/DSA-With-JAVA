import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{
    int id;
      
    String name;
      
    int age;
      
    String gender;
      
    String department;
      
    int yearOfJoining;
      
    double salary;
      
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
      
    public int getId() 
    {
        return id;
    }
      
    public String getName() 
    {
        return name;
    }
      
    public int getAge() 
    {
        return age;
    }
      
    public String getGender() 
    {
        return gender;
    }
      
    public String getDepartment() 
    {
        return department;
    }
      
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
      
    public double getSalary() 
    {
        return salary;
    }
      
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(0, "manav", 27, "male", "SE", 2022, 20000));
        emp.add(new Employee(1, "dhruv", 24, "male", "SE", 2022, 20000));
        emp.add(new Employee(2, "ajay", 23, "male", "Testing", 2022, 20000));
        emp.add(new Employee(3, "ujjawal", 28, "male", "SE", 2022, 20000));
        emp.add(new Employee(4, "parth", 24, "male", "Design", 2022, 20000));
        Map<String, Long> map = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map);
    }
}