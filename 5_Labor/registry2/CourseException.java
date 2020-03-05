package registry2;

public class CourseException extends Exception {
    Course course;

    public CourseException(String message, Course course) {
        super(message);
        this.course = course;
    }

    @Override
    public String getMessage() {
        return this.course.getName();
    }
}