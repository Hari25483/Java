public class TestBook {
    public static void main(String[] args) {
        Author Hari=new Author("Hari","dadada@gmail.com",'M');
        System.out.println(Hari);

        Book dummy=new Book("Java for dummies", Hari, 9.99,99);
        System.out.println(dummy);
        dummy.setPrice(6.66);
        System.out.println(dummy.getPrice());
        System.out.println(dummy.getAuthor());
        System.out.println(dummy.getAuthor().getName());
        System.out.println(dummy.getAuthor().getEmail());

        Book moreDummyBook = new Book("Java for more dummies",
                new Author("Peter Lee", "peter@nowhere.com", 'm'), // an anonymous Author's instance
                19.99, 8);
        System.out.println(moreDummyBook);  // Book's toString()
        }
    }