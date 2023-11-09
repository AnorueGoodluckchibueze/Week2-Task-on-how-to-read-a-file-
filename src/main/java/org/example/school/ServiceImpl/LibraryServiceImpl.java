package org.example.school.ServiceImpl;

import org.example.school.DTOs.UserDto;
import org.example.school.Service.LibraryService;
import org.example.school.User;
import org.example.school.entities.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class LibraryServiceImpl implements LibraryService<User,Books,UserDto> {
private static List<Books>booksToBorrow = new ArrayList<>();
private static List<UserDto> userDtos = new ArrayList<>();
 private static PriorityQueue<User> borrowingQueue = new PriorityQueue<>();
 private static PriorityQueue<User> comparatorQueue = new PriorityQueue<>();

 public UserDto addUserToQueue(User user, UserDto userDto){
     System.out.println("Adding user to queue...");
     borrowingQueue.add(user);
     userDtos.add(userDto);
     return userDto;
 }
    @Override
    public UserDto addUserTOComparatorQueue(User user, UserDto usersDto) {
        System.out.println("Adding user to queue.....");
        comparatorQueue.add(user);
        userDtos.add(usersDto);
        return usersDto;
    }

    @Override
    public List<Books> addBook(Books book) {
        System.out.println("Adding books to shelf....");
        booksToBorrow.add(book);
        return booksToBorrow;
    }

    @Override
    public void borrowingBook() {
     while (!comparatorQueue.isEmpty()){
         User user = comparatorQueue.poll();
         UserDto userDto = userDtos.stream()
                 .filter(userDto1 -> userDto1.getEmail()
                         .equals(user.getEmail()))
                 .toList().get(0);
         System.out.println("Getting user order...");
         if(!booksToBorrow.contains(userDto.getBorrowBook())){
             System.out.println("User with Email: "+ ""+
                     user.getEmail()+" could not get the "
                     + userDto.getBorrowBook()
             + " wanted! because it not available" + userDto.getBorrowBook());
         }
         else {
             System.out.println("User with Email: " +""+ user.getEmail()
                     + "just received a "+ userDto.getBorrowBook() + " book");
             booksToBorrow.remove(userDto.getBorrowBook());

         }
         userDtos.remove(userDto);


     }

    }
}


