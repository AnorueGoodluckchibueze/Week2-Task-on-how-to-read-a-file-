package org.example.school.DTOs;

import lombok.Data;
import org.example.school.User;
import org.example.school.entities.Books;
@Data
public class UserDto {
    private String email;
    private Books borrowBook;
    public UserDto(User user, Books books){
       this.email = user.getEmail();
       this.borrowBook = books;
    }
}
