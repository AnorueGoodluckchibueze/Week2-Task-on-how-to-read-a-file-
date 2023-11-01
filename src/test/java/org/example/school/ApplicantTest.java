package org.example.school;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class ApplicantTest {
    @Test
    public void applying() {
    Applicant apply = new Applicant("Wilson College", "2013-07-04", "Osun", "Ife-east", "Physics");
        Assert.assertEquals(apply.getClass(), Applicant.class);
        Assert.assertEquals("2013-07-04", apply.getYearAttendSecondarySchool());
        Assert.assertEquals("Wilson College", apply.getSecondarySchool());
        Assert.assertEquals("Osun",apply.getStateOfOrigin());
        Assert.assertEquals("Ife-east", apply.getLGAofOrigin());
    }
}