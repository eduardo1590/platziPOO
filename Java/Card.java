public class Card extends Payment{
    
    Integer name;
    Integer cvv;
    String date;

    public Card(Integer id, Integer name, Integer cvv, String date) {
        super(id);
        this.name = name;
        this.cvv = cvv;
        this.date = date;
    }
}
