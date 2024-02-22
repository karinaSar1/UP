public class AdultBirthdaySet implements BirthdayFactory {
    public Gift getGift() {
        return new AdultGift();
    }

    public Card getCard() {
        return new AdultCard();
    }

    public Cake getCake() {
        return new AdultCake();
    }
}
