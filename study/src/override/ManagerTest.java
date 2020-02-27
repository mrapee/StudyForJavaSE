package override;

import java.util.Date;

/**
 * @program: StudyForJavaSE
 * @description: 测试类
 * @author: yuan_shen
 * @create: 2020-02-25 12:11
 **/

public class ManagerTest {
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.setName("袁申");
        manager.setHiredate(new Date());
        manager.setPost("雇员");
        manager.setSalary(10000);
        Address address = new Address();
        address.setCountry("中国");
        address.setProvince("河南省");
        address.setCity("周口市");
        address.setStreet("川汇区");
        manager.setAddress(address);
        manager.setBonus(5000);
        System.err.println(manager.getSalary());
        System.err.println(manager.toString());
    }
}
