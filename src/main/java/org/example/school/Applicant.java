package org.example.school;

import java.time.LocalDate;

public class Applicant extends User {
    private String secondarySchool;
    private String yearAttendSecondarySchool;
    private String stateOfOrigin;
    private String LGAofOrigin;
    private String DegreeProgramApplied;

    public Applicant(String secondarySchool, String yearAttendSecondarySchool, String stateOfOrigin, String LGAofOrigin, String degreeProgramApplied) {
        this.secondarySchool = secondarySchool;
        this.yearAttendSecondarySchool = yearAttendSecondarySchool;
        this.stateOfOrigin = stateOfOrigin;
        this.LGAofOrigin = LGAofOrigin;
        DegreeProgramApplied = degreeProgramApplied;
    }

    public String getSecondarySchool() {
        return secondarySchool;
    }

    public void setSecondarySchool(String secondarySchool) {
        this.secondarySchool = secondarySchool;
    }

    public String getYearAttendSecondarySchool() {
        return yearAttendSecondarySchool;
    }

    public void setYearAttendSecondarySchool(String yearAttendSecondarySchool) {
        this.yearAttendSecondarySchool = yearAttendSecondarySchool;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getLGAofOrigin() {
        return LGAofOrigin;
    }

    public void setLGAofOrigin(String LGAofOrigin) {
        this.LGAofOrigin = LGAofOrigin;
    }

    public String getDegreeProgramApplied() {
        return DegreeProgramApplied;
    }

    public void setDegreeProgramApplied(String degreeProgramApplied) {
        DegreeProgramApplied = degreeProgramApplied;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "secondarySchool='" + secondarySchool + '\'' +
                ", yearAttendSecondarySchool='" + yearAttendSecondarySchool + '\'' +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                ", LGAofOrigin='" + LGAofOrigin + '\'' +
                ", DegreeProgramApplied='" + DegreeProgramApplied + '\'' +
                '}';
    }
}
