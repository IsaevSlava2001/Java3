public class Main
{

    public static void main(String[] args)
    {
        Employee model=retriveCourseFromDatabase();
        EmployeeView view=new EmployeeView();
        EmployeeContoller controller=new EmployeeContoller(model,view);
        controller.updateView();
        controller.setEmployeename("Иван");
        System.out.println("After updating, Course Details are as follows"); controller.updateView();

    }
    private static Employee retriveCourseFromDatabase()
    {
        Employee employee = new Employee();
        employee.setEmployeeName("Игорь");
        employee.setEmployeeID("01");
        employee.setEmployeeStage("15");
        employee.setEmployeework("programmer");
        employee.setEmployeemoney("200000");
        return employee;
    }
}