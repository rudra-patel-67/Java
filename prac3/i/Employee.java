class Employee {
    private String name;
    private int age;
    private String gender;
    
    public void setEmpDetails(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpDetails("Jay",27, "Male");
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Gender: " + emp.getGender());
    }
}
