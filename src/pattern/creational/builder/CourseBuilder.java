package pattern.creational.builder;

/**
 * @author 陈超文
 * @create 2019-12-25 22:01
 */
public abstract class CourseBuilder {

    public abstract void bulidCourseName(String courseName);
    public abstract void bulidCoursePPT(String coursePPT);
    public abstract void bulidCourseVideo(String courseVideo);
    public abstract void bulidCourseArticle(String courseArticle);
    public abstract void bulidCourseQA(String courseQA);

    public abstract Course makeCourse();
}
