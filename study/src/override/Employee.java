package override;

import java.util.Date;

/**
 * @program: StudyForJavaSE
 * @description: 雇员类
 * @author: yuan_shen
 * @create: 2020-02-25 11:53
 **/

public class Employee {
    private Address address;
    private Date hiredate;
    private int salary;
    private String name;
    private String post;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
