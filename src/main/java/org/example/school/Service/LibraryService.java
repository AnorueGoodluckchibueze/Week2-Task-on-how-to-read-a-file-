package org.example.school.Service;

import org.example.school.entities.Books;
import org.example.school.User;

import java.util.List;

public interface LibraryService<U,B,D> {
D addUserTOComparatorQueue(U user,D usersDto);
List<B>addBook(B book);
void borrowingBook();
}
