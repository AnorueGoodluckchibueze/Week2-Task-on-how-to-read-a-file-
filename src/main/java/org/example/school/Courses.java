package org.example.school;

public class Courses {
    private String  code;
    private String courseTitle;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "code='" + code + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                '}';
    }
}

