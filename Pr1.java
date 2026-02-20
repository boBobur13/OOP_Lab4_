public class Pr1 {
    static class LibraryBook {
        private String bookTitle;
        private String author;
        private int pages;
        public LibraryBook() {
            this.bookTitle = "Unknown";
            this.author = "Unknown";
            this.pages = 1;
        }
        public LibraryBook(String bookTitle, String author, int pages) {
            setBookTitle(bookTitle);
            setAuthor(author);
            setPages(pages);
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = (bookTitle != null && !bookTitle.isEmpty()) ? bookTitle : "Unknown";
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = (author != null && !author.isEmpty()) ? author : "Unknown";
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            if (pages > 0) {
                this.pages = pages;
            }
        }

        public boolean isThick() {
            return pages > 500;
        }

        public void displayInfo() {
            System.out.println("Title: " + bookTitle);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Is thick? " + (isThick() ? "Yes" : "No"));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String author = "J.K. Rowling";

        LibraryBook book1 = new LibraryBook();
        book1.setBookTitle("O'tgan Kunlar");
        book1.setAuthor("Abdulla Qodiriy")
        book1.setPages(223);

        LibraryBook book2 = new LibraryBook();
        book2.setBookTitle("Mehrobdan Chayon");
        book2.setAuthor("Abdulla Qodiriy");
        book2.setPages(251);

        System.out.println("===== BOOK 1 =====");
        book1.displayInfo();
        
        System.out.println("===== BOOK 2 =====");
        book2.displayInfo();
    }
}
