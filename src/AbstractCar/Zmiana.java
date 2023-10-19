package AbstractCar;

import java.util.Objects;

public class Zmiana {
    public Zmiana(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




    String name;
    int age;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Zmiana zmiana = (Zmiana) o;

        if (age != zmiana.age) return false;
        return Objects.equals(name, zmiana.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
//te dwie metody to mechanizm do szukania takich samych obiektow
//    @Override
//    public boolean equals(final Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        final Zmiana zmiana = (Zmiana) o;
//        return name.length() == zmiana.name.length();
//    }
//java wyszukuje obiekty po numerach, nadanych przez metode hashCode
//    @Override
//    public int hashCode() {
//        Random r = new Random();
//        return r.nextInt();
//    }
}
