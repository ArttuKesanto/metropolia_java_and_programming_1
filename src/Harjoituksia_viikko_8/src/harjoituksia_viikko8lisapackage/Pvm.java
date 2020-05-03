package harjoituksia_viikko8lisapackage;

import java.time.LocalDate;

public class Pvm {

    private int day;
    private int month;
    private int year;

    public Pvm() {
        this.day = LocalDate.now().getDayOfMonth();
        this.month = LocalDate.now().getMonthValue();
        this.year = LocalDate.now().getYear();
    }

    public Pvm(String[] pvm) {
        this.day = Integer.parseInt(pvm[0]);
        this.month = Integer.parseInt(pvm[1]);
        this.year = Integer.parseInt(pvm[2]);
    }

    public boolean aiemmin(Pvm verrattava) {
        if (this.year < verrattava.year) {
            return true;
        }

        if (this.year == verrattava.year
                && this.month < verrattava.month) {
            return true;
        }

        if (this.year == verrattava.year
                && this.month == verrattava.month
                && this.day < verrattava.day) {
            return true;
        }
        return false;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
