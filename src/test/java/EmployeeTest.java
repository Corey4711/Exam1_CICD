import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.junit.Assert.assertThrows;


public class EmployeeTest {
    Employee Employee;
    EmployeeList List;

    @BeforeEach
    void setUp(){
        Employee = new Employee("","");

    }

    @Test
    void addToListNameSuccessful(){
        Employee employee= new Employee("COREY","123456654321");
        List.addEmployee(employee);
        Assert.assertEquals(List.list.size(),1);
    }

    @Test
    void addToListNameFail(){
        Employee employee= new Employee("CO","123456654321");
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    List.addEmployee(employee);
                }
        );
        Assert.assertEquals(exception.getMessage(),"Name Too Short");
    }
    @Test
    void addToListNumberFail(){
        Employee employee= new Employee("COREY","121");
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    List.addEmployee(employee);
                }
        );
        Assert.assertEquals(exception.getMessage(),"Number should be 12 digits");
    }

    @Test
    void deleteFromListSuccessful(){
        Employee employee= new Employee("COREY","123456654321");
        List.addEmployee(employee);
        List.addEmployee(employee);
        List.deleteEmployee(employee.getNumber());
        Assert.assertEquals(List.list.size(),1);
    }

    @Test
    void getListSizeSuccessful(){
        Employee employee= new Employee("COREY","123456654321");
        List.addEmployee(employee);
        List.addEmployee(employee);
        Assert.assertEquals(List.getListSize(),2);
    }



}
