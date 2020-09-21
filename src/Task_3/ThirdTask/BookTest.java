package Task_3.ThirdTask;

public class BookTest {
    public static void main(String args[]){
        Book obj = new Book();
        obj.setAuthor("Stephen King");
        obj.setTitle("Carrie");
        obj.setGenre("novel");
        obj.setYear(1974);
        System.out.println(obj.ToString());

        obj.setAuthor("Jules Verne");
        obj.setTitle("Around the World in Eighty Days");
        obj.setGenre("adventure novel");
        obj.setYear(1873);
        System.out.println(obj.ToString());
    }
}
