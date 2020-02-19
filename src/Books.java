public class Books {
    private Book[] shelf;
    private int booksAmount;


    public Book[] getShelf() {
        return shelf;
    }

    public int getBooksAmount() {
        return booksAmount;
    }

    public Books(int booksAmount) {
        this.booksAmount = booksAmount;
        shelf = new Book[booksAmount];
    }

    public void addBook(Book book) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                shelf[i] = book;
                break;
            }

        }
    }

    public void showAllBooks() {
        for (Book elem : shelf) {
            if (elem == null) {
                break;
            }
            elem.view();
        }
    }

    public void changePrice(int percentage) {
        double newPersentage = percentage * 0.01f;
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                break;
            }
            double oldPrice = shelf[i].getPrice();
            double newPrice = oldPrice + oldPrice * newPersentage;
            shelf[i].setPrice(newPrice);
        }
    }

    public Books findByAuthor(String author) {
        Books authorMass = new Books(booksAmount);
        int counter = 0;
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                break;
            }
            String authorName = shelf[i].getAuthor();
            if (authorName.equals(author)) {
                authorMass.shelf[counter] = shelf[i];
                counter++;
            } if (counter == 0) {
                System.out.println("Books of this author are not found");
                break;
            }
        }
            return authorMass;
        }


        public Books findByYear ( int year){
            Books yearMass = new Books(booksAmount);
            int counter = 0;
            for (int i = 0; i < shelf.length; i++) {
                if (shelf[i] == null) {
                    break;
                }
                int yearOfIssue = shelf[i].getYear();
                if (yearOfIssue > year) {
                    yearMass.shelf[counter] = shelf[i];
                    counter++;
                }
                if (counter == 0) {
                    System.out.println("Books published after this year are not found");
                    break;
                }
                    }

            return yearMass;
        }
    }