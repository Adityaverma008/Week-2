class Book{          //it is  a superclass
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book{        //it is a baseclass
    String name;
    String bio;

    public Author(String title, int publicationYear , String name , String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo(){                   //this function displayinformation of both class
        // super.displayInfo();
         System.out.println("The name of the Book is:- " + name);
         System.out.println("The bio of the book is:- " + bio);
         System.out.println("The title of the book is:- " + title);
         System.out.println("The publicationYear of the book is:- " + publicationYear);
     }
 
}
    
public class library {
    public static void main(String[] args) {
        Author obj = new Author("Beleive on yourselves" ,2000, "Rich dad poor dad", "hardwork payoff");
        obj.displayInfo();
    }
}
