package pattern.creational.builder.v2;


/**
 * @author 陈超文
 * @create 2019-12-26 22:43
 */
public class Coach {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java设计模式精讲").buildCourseQA("java设计模式问答").build();
        System.out.println(course);
    }
}
