package railApplication.Domain;

/**
 * Created by student on 2015/04/18.
 */
public class TrainDriver {


   // @Id
   // @GeneratedValue(strategy = GenerationType .AUTO)

    private  int employeeNumber;
    private   String firstName;
    private   String lastName;


    private TrainDriver()
    {

    }

    public TrainDriver(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.firstName      = builder.firstName;
        this.lastName       = builder.lastName;
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

    public static class Builder
    {
        private  int employeeNumber;
        private   String firstName;
        private   String lastName;

        public Builder(int empNo)
        {
            this.employeeNumber = empNo;
        }

        public Builder firstName(String fN)
        {
            this.firstName = fN;

            return this;
        }

        public Builder lastName(String lN)
        {
            this.lastName = lN;
            return this;
        }

        public TrainDriver build()
        {
            return new TrainDriver(this);
        }

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TrainDriver that = (TrainDriver) object;

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
        return "TrainDriver{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
