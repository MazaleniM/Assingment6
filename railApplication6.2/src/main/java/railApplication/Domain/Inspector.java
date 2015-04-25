package railApplication.Domain;


import javax.persistence.*;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Inspector {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private int employeeNumber;
    private String lastName;
    private String firstName;

    private Inspector()
    {}
    public Long getId() {
        return id;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Inspector(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.firstName      = builder.firstName;
        this.lastName       = builder.lastName;
        this.id             = builder.id;

    }


    public static class Builder
    {
        private int employeeNumber;
        private String lastName;
        private String firstName;
        private Long id;

        public Builder(int e)
        {
            this.employeeNumber = e;
        }

        public Builder lastName(String f)
        {
            this.firstName = f;

            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder firstName(String l)
        {
            this.lastName = l;

            return this;
        }

        public Builder copy(Inspector inspector)
        {
            this.employeeNumber = inspector.getEmployeeNumber();
            this.firstName      = inspector.getFirstName();
            this.lastName       = inspector.getLastName();
            this.id             = inspector.getId();

            return this;

        }

        public Inspector Builder()
        {
            return new Inspector(this);
        }

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Inspector inspector = (Inspector) object;

        if (employeeNumber != inspector.employeeNumber) return false;
        if (!firstName.equals(inspector.firstName)) return false;
        if (!lastName.equals(inspector.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + employeeNumber;
        result = 31 * result + lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Inspector{" +
                "employeeNumber=" + employeeNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

}
