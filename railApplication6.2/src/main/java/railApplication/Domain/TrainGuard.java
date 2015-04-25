package railApplication.Domain;

import javax.persistence.*;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class TrainGuard {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private int employeeNumber;
    private String firstName;
    private String lastName;


    private TrainGuard()
    {}
    public Long  getId() {
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

    public TrainGuard(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.firstName  = builder.firstName;
        this.lastName   = builder.lastName;
        this.id         = builder.id;
    }


    public static class Builder
    {
        private int employeeNumber;
        private String firstName;
        private String lastName;
        private Long id;

        public Builder(int n)
        {
            this.employeeNumber = n;

        }


        public Builder firstName(String f)
        {
            this.firstName = f;

            return this;
        }

        public Builder id(Long id)
        {
            this.id= id;
            return this;
        }


        public Builder lastName(String l)
        {
            this.lastName = l;

            return this;
        }

        public TrainGuard build()
        {
            return new TrainGuard(this);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TrainGuard that = (TrainGuard) object;

        if (employeeNumber != that.employeeNumber) return false;
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
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TrainGuard{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
