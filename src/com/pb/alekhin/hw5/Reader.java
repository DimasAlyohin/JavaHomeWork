package com.pb.alekhin.hw5;

public class Reader {

    private String name;
    private int libraryCard;
    private String faculty;
    private String birth;
    private String phoneNumber;

    public Reader(String name, int libraryCard, String faculty, String birth, String phoneNumber) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int x) {
        if (x == 1){
            System.out.println(name + " взял " + x + " книгу.");
        } else if (x == 2 || x == 3 || x == 4) {
            System.out.println(name + " взял " + x + " книги.");
        } else if (x > 4) {
            System.out.println(name + " взял " + x + " книг.");
        }
    }

    public void takeBook(Book title0, Book title1, Book title2){
        System.out.println(name + " взял книги: " + title0.getBookTitle() + ", "
                    + title1.getBookTitle() + ", " + title2.getBookTitle());
    }

    public void takeBook(Book title0, Book author0, Book year0 , Book title1, Book author1, Book year1 ,Book title2, Book author2, Book year2) {
        System.out.println(name + " взял книги: " + title0.getBookTitle() + " (" + author0.getBookAuthor() + ", " + year0.getYearPublishing() +
                "), " + title1.getBookTitle() + " (" + author1.getBookAuthor() + ", " + year1.getYearPublishing() +
                "), " + title2.getBookTitle() + " (" + author2.getBookAuthor() + ", " + year2.getYearPublishing() +
                ").");
    }
    public void returnBook(int x) {
        if (x == 1){
            System.out.println(name + " вернул " + x + " книгу.");
        } else if (x == 2 || x == 3 || x == 4) {
            System.out.println(name + " вернул " + x + " книги.");
        } else if (x > 4) {
            System.out.println(name + " вернул " + x + " книг.");
        }
    }
    public void returnBook(Book title0, Book title1, Book title2){

        System.out.println(name + " вернул книги: " + title0.getBookTitle() + ", "
                + title1.getBookTitle() + ", " + title2.getBookTitle());
    }
    public void returnBook(Book title0, Book author0, Book year0 , Book title1, Book author1, Book year1 ,Book title2, Book author2, Book year2) {
        System.out.println(name + " вернул книги: " + title0.getBookTitle() + " (" + author0.getBookAuthor() + ", " + year0.getYearPublishing() +
                "), " + title1.getBookTitle() + " (" + author1.getBookAuthor() + ", " + year1.getYearPublishing() +
                "), " + title2.getBookTitle() + " (" + author2.getBookAuthor() + ", " + year2.getYearPublishing() +
                ").");
    }



    String getInfo() {
        return "ФИО: " + name + "(Номер читательского билета: " + libraryCard + ". Факультет: " + faculty
                + ". Дата рождения: " + birth + ". Номер телефона: " + phoneNumber + ")";
    }
}
