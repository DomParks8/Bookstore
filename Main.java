public class Main {
    public static void main(String[] args) {

        Bookstore store = new Bookstore("Dom","123 Mulberry st", Concord NC, 28027", true, "8:00 pm",
                "200,000 square feet", "We only sell new books");

        System.out.println(store.getName());
        System.out.println(store.getAddress());
        System.out.println(store.getOpen());
        System.out.println(store.getClosingTime());
        System.out.println(store.getStoreSize());
        System.out.println(store.getNewOrUsedBooks());

    }
}