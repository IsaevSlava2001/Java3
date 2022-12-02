public class EmployeeContoller
{
    private Employee model;
    private EmployeeView view;

    public EmployeeContoller(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }
    public void setEmployeename(String Employeename)
    {
        model.setEmployeeName(Employeename);
    }
    public String getEmployeename()
    {
        return model.getEmployeeName();
    }
    public void setEmployeeID(String EmployeeID)
    {
        model.setEmployeeID(EmployeeID);
    }
    public String getEmployeeID()
    {
        return model.getEmployeeID();
    }
    public void setEmployeeStage(String EmployeeStage)
    {
        model.setEmployeeStage(EmployeeStage);
    }
    public String getEmployeeStage()
    {
       return model.getEmployeeStage();
    }
    public void setEmployeeWork(String EmployeeWork)
    {
        model.setEmployeework(EmployeeWork);
    }
    public String getEmployeeWork()
    {
        return model.getEmployeework();
    }
    public void setEmployeeMoney(String EmployeeMoney)
    {
        model.setEmployeemoney(EmployeeMoney);
    }
    public String getEmployeeMoney()
    {
        return model.getEmployeemoney();
    }
    public void updateView() {
        view.printCourseDetails(model.getEmployeeName(), model.getEmployeeID(), model.getEmployeeStage(), model.getEmployeework(), model.getEmployeemoney());
    }
}
