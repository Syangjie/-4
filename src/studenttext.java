import java.util.ArrayList;

class Student {

    private int studentNumber;
    private String name;
    private double course1;
    private double course2;
    private double course3;
    private double averageScores;


    public Student(int studentNumber, String name, double course1, double course2, double course3) {
        super();
        this.studentNumber = studentNumber;
        this.name = name;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public double getCourse1() {
        return course1;
    }

    public double getCourse2() {
        return course2;
    }

    public double getCourse3() {
        return course3;
    }

    public double getAverageScores() {
        return averageScores;
    }


    public double sum() {
        double sum = course1 + course2 + course3;
        return sum;
    }


    public void averageScores() {
        this.averageScores = this.sum() / 3;
        System.out.println(name + "平均成绩：" + averageScores);
    }
}

     class StudentManageSystem {

        private ArrayList<Student> list = new ArrayList<Student>();


        public int find(int s) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getStudentNumber() == s) {
                    return i;
                }
            }
            return -1;
        }


        public void add(Student s) {
            list.add(s);
        }


        public void show() {
            for (Student i : list) {
                System.out.println("学号：" + i.getStudentNumber() + "\t" + "姓名：" + i.getName() + "\t" + "课程1:"
                        + i.getCourse1() + "\t" + "课程2:" + i.getCourse2() + "\t" + "课程3:" + i.getCourse3() + "\t" + "平均成绩"
                        + i.getAverageScores());
            }
        }


        public void delete(int s) {
            int i = find(s);
            if (i == -1) {
                System.out.println("没有学生信息");
            } else {
                list.remove(i);
                System.out.println("学号：" + list.get(i).getStudentNumber() + "\t" + "姓名：" + list.get(i).getName() + "\t" + "课程1:"
                        + list.get(i).getCourse1() + "\t" + "课程2:" + list.get(i).getCourse2() + "\t" + "课程3:" + list.get(i).getCourse3());
                System.out.println("删除成功");
            }
        }


        public void sum(int s) {
            int i = find(s);
            if (i == -1) {
                System.out.println("没有学生信息");
            } else {
                double sum = list.get(i).sum();
                System.out.println(list.get(i).getName() + "总分为：" + sum);
            }
        }


        public void averageScores(int s) {
            int i = find(s);
            if (i == -1) {
                System.out.println("没有学生信息");
            } else {
                list.get(i).averageScores();
            }
        }
    }


    public class studenttext {

        public static void main(String[] args) {
            StudentManageSystem sms = new StudentManageSystem();
            sms.add(new Student(1, "001", 84, 91, 70));
            sms.add(new Student(2, "002", 60, 98, 60));
            sms.add(new Student(3, "003", 70, 60, 80));
            sms.add(new Student(4, "004", 80, 71, 83));
            sms.add(new Student(5, "005", 60, 68, 80));
            sms.show();
            System.out.println("****************");
            sms.delete(1);
            System.out.println("****************");
            sms.sum(3);
            System.out.println("****************");
            sms.averageScores(2);
        }
    }

