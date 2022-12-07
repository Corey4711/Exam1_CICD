public class Employee {

    private String name;
    private String number;

    public Employee(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 4) this.name = name;
        else throw new IllegalArgumentException("Name Too Short");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number.length() == 12) this.number = number;
        else throw new IllegalArgumentException("Number should be 12 digits ");
    }

    public Employee setEmployee(){
        if(name.length() > 4) this.name = name;
        else throw new IllegalArgumentException("Name Too Short");

        if(number.length() == 12) this.number = number;
        else throw new IllegalArgumentException("Number should be 12 digits ");

        return new Employee(name,number);
    }

}
