package AbstractCar;

import java.time.LocalDate;

public class User {
//wstawic id auta ktory wypozyczyl
    private int id;
    private String firstName;
    private String lastName;

    private String email;
    private int telNumber;
    private LocalDate dateOfBirth;

    public User(final int id, final String firstName, final String lastName, final String email, final int telNumber, final LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telNumber = telNumber;
        this.dateOfBirth = dateOfBirth;
    }

    int getId() {
      return id;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(final String email) {
        this.email = email;
    }

    private int getTelNumber() {
        return telNumber;
    }

    private void setTelNumber(final int telNumber) {
        this.telNumber = telNumber;
    }
    private LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(final LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", telNumber=" + telNumber +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }}