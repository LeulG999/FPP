package HashHomeWork.Problem3;

import java.util.HashMap;

public class Library {
    public HashMap<String,Book> hMap=new HashMap<>();
    public void addBook(String ISBN, String title, String author){
        if(hMap.containsKey(ISBN)){
            System.out.println("This Book is already in the collection");
            return;
        }
        hMap.put(ISBN,new Book(ISBN,title,author));
        System.out.println("Book Added Successfully");
    }
    public void borrowBook(String ISBN){
        if(hMap.containsKey(ISBN)){
            Book b=hMap.get(ISBN);
            if(b.isBorrowed()){
                System.out.println("The Book is already borrowed, Unavailable this time ");
            }
            else{
                b.setBorrowed(true);
                System.out.println("Book Borrowed Successfully");
            }
        }
        else{
            System.out.println("There is no book with this ISBN");
        }
    }
    public void returnBook(String ISBN){
        Book b=hMap.get(ISBN);
        if(b==null){
            System.out.println("Book not found");
            return;
        }
        if(b.isBorrowed()){
            b.setBorrowed(false);
            System.out.println("Thank you for returning the book");
            return;
        }
        else {
            System.out.println("This book was not borrowed");
        }
    }
    public boolean isBookBorrowed(String ISBN){
        Book b=hMap.get(ISBN);
        if(b==null)return false;
        return b.isBorrowed();
    }
    public Book getBookDetails(String ISBN){
        return hMap.get(ISBN);
    }
    public void listAllBooks(){
        for(Book b: hMap.values()){
            System.out.println(b);
        }
    }
    public void listBorrowedBooks(){
        for(Book b: hMap.values()){
            if(b.isBorrowed()){
                System.out.println(b);
            }
        }
    }

}
