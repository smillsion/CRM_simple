package abstarctfactory;

/**
 * @author 陈超文
 * @create 2019-12-23 22:11
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
