package pattern.creational.builder;

/**
 * @author 陈超文
 * @create 2019-12-25 22:22
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("JAVA设计模式精讲",
                "JAVA设计模式精讲PPT",
                "JAVA设计模式精讲录像",
                "JAVA设计模式精讲手记",
                "JAVA设计模式精讲问答");
        System.out.println(course);
    }
}
