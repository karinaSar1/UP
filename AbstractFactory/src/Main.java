//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //AdultBirthdaySet birthdaySet = new AdultBirthdaySet();
        KidsBirthdaySet kidsBirthdaySet = new KidsBirthdaySet();
        System.out.println(doPaty(kidsBirthdaySet));
    }

    public static String doPaty(BirthdayFactory birthdayFactory) {
        return birthdayFactory.getCard().getName() + " и " +
                birthdayFactory.getGift().getName() + " и " +
                birthdayFactory.getCake().getName();
    }
}