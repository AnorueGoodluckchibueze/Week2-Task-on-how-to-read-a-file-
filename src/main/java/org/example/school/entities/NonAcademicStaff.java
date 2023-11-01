package org.example.school.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NonAcademicStaff extends Staff {
    private String Section;

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    @Override
    public String toString() {
        return "NonAcademicStaff{" +
                "Section='" + Section + '\'' +
                '}';
    }
}
