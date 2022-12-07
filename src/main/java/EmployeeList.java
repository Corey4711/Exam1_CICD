import java.util.ArrayList;

public class EmployeeList {
    ArrayList<Employee> list = new ArrayList<Employee>();


    public void addEmployee(Employee employee){
       Employee employee1 = employee.setEmployee();
       list.add(employee1);
    }

    public void deleteEmployee(String id){
        list.remove(Integer.valueOf(id));

    }

    public int getListSize(){
        return list.size();
    }

}
