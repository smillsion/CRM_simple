package abstarctfactory;

/**
 * @author 陈超文
 * @create 2019-12-23 22:21
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
