import java.util.ArrayList;
import java.util.List;

// 1. 定义一个简单的实体类
class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void printInfo() {
        System.out.printf("姓名: %-8s | 年龄: %d | 成绩: %.1f\n", name, age, score);
    }

    public double getScore() {
        return score;
    }
}

// 2. 主程序
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 学生管理系统测试 ===");

        // 创建集合存储对象
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 88.5));
        students.add(new Student("Bob", 21, 92.0));
        students.add(new Student("Charlie", 19, 79.5));

        // 遍历并打印所有学生信息
        double totalScore = 0;
        for (Student s : students) {
            s.printInfo();
            totalScore += s.getScore();
        }

        // 计算并输出平均分
        double averageScore = totalScore / students.size();
        System.out.println("-----------------------------------");
        System.out.printf("班级平均分: %.2f\n", averageScore);
    }
}