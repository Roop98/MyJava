package ee.sdacademy;

public class LessonTen {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAge(10);
        employee.setId("1");
        employee.setName("Roop");
        employee.setTitle("Junior Engineer");
        employee.setFamily("Java Academy");
        System.out.println(employee.getAge());
        System.out.println(employee.getFamily());
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getTitle());
        System.out.println(employee);
    }
}