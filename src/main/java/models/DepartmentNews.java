package models;

public class DepartmentNews extends News{
    public String departmentId;

    public DepartmentNews(String topic, String writer, String departmentId) {
        super(topic, writer);
        this.departmentId = departmentId;
    }

    public static DepartmentNews setUpNewDepartmentNews(){
        return new DepartmentNews("economic times","mike","ABMI");
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
