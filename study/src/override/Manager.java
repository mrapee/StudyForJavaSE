package override;

/**
 * @program: StudyForJavaSE
 * @description: 经理
 * @author: yuan_shen
 * @create: 2020-02-25 12:03
 **/

/**
 * super只是指示编译器调用超类方法的关键词，并不是一个对象引用，因此不能赋值给其他对象
 * 这是和this的一点区别
 */

public class Manager extends Employee {

    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }
}
