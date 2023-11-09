package org.example.school.entities;

import org.example.school.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    public int compare(User o1, User o2) {
        return Integer.compare(o2.getRole().ordinal(), o1.getRole().ordinal());
    }
}
