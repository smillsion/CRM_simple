package pattern.creational.builder;

/**
 * @author 陈超文
 * @create 2019-12-25 22:16
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,
                             String courseQA){
        this.courseBuilder.bulidCourseName(courseName);
        this.courseBuilder.bulidCoursePPT(coursePPT);
        this.courseBuilder.bulidCourseVideo(courseVideo);
        this.courseBuilder.bulidCourseArticle(courseArticle);
        this.courseBuilder.bulidCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
