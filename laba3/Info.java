package bsu.rfe.java.group5.lab_3.Skabitski.var4B;

public class Info {
    private final String surname = "Скабицкий";
    private final int group = 5;

    @Override
    public String toString() {
        return "Фамилия: " + surname + " " +
                ", Группа: " + group;
    }
}
