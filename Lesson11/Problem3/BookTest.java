package HashHomeWork.Problem3;
public class BookTest {
    public static void main(String[] args){
        Library l1=new Library();
        // Adding
        l1.addBook("b001","Ego is enemy", "Ryan Holiday");
        l1.addBook("b002","The Power of habit", "Charles");
        l1.addBook("b003","48 Laws of Power", "Robert Green");
        l1.addBook("b004","The silent Patient", "Alex");
        l1.addBook("b005","The House Maid", "Frieda");
        l1.addBook("b006","A man and hsi symbol", "Carl jung");
        l1.addBook("b007","The Monk who sold his Ferrari", "Robin Sharma");
        //Borrow
        l1.borrowBook("b007");
        l1.borrowBook("b007");
        l1.borrowBook("b002");
        l1.borrowBook("b003");
       // return
         l1.returnBook("b002");
         // checking if it is Borrowed
        System.out.println(l1.isBookBorrowed("b007"));
        //Book detail
        System.out.println(l1.getBookDetails("b002"));
        //All book
        l1.listAllBooks();
        // only Borrowed Books
        System.out.println("-----------");
        l1.listBorrowedBooks();

    }
}
