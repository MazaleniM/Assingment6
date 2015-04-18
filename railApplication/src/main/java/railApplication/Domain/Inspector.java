package railApplication.Domain;

/**
 * Created by student on 2015/04/18.
 */
public class Inspector {

   // @Id
   // @GeneratedValue(GenerationType.AUTO)
    private int employeeNumber;
    private String lastName;
    private String firstName;

    private Inspector()
    {}

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

    }


    public static class Builder
    {
        private int employeeNumber;
        private String lastName;
        private String firstName;

        public Builder(int e)
        {
            this.employeeNumber = e;
        }

        public Builder lastName(String f)
        {
            this.firstName = f;

            return this;
        }

        public Builder firstName(String l)
        {
            this.lastName = l;

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
