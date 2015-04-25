package railApplication.Domain;

import javax.persistence.*;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class SecurityOfficer {

     @Id
     @GeneratedValue(strategy =GenerationType.AUTO)

     private Long id;
    @Column(unique = true)
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private char grade;

    private SecurityOfficer()
    {

    }
    public Long getId() {
        return id;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGrade() {
        return grade;
    }

    public SecurityOfficer(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.firstName    = builder.firstName;
        this.lastName     = builder.lastName;
        this.grade        = builder.grade;
        this.id           = builder.id;
    }

    public static class Builder
    {

        private int employeeNumber;
        private String firstName;
        private String lastName;
        private char grade;
        private Long id;


        public Builder(int n)
        {
            this.employeeNumber = n;
        }

        public Builder firstName(String n)
        {
            this.firstName = n;

            return this;
        }

        public Builder lastName(String l)
        {
            this.lastName = l;

            return this;

        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder grade(char g)
        {
            this.grade = g;

            return this;
        }


        public SecurityOfficer build()
        {
            return new SecurityOfficer(this);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        SecurityOfficer that = (SecurityOfficer) object;

        if (employeeNumber != that.employeeNumber) return false;
        if (grade != that.grade) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + employeeNumber;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + (int) grade;
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SecurityOfficer{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }

}
