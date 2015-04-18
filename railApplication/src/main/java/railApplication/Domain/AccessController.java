package railApplication.Domain;

/**
 * Created by student on 2015/04/18.
 */
public class AccessController {

   // @Id
   // @generatedValue(GenerationStrategy.AUTO)
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String stationName;


    private AccessController()
    {}


    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStationName() {
        return stationName;
    }

    public AccessController(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.firstName      = builder.firstName;
        this.lastName       = builder.lastName;
        this.stationName    = builder.stationName;
    }


    public static class Builder
    {

        private int employeeNumber;
        private String firstName;
        private String lastName;
        private String stationName;


        public Builder(int e)
        {
            this.employeeNumber = e;

        }

        public Builder lastName(String n)
        {
            this.lastName = n;

            return this;
        }


        public Builder firstname(String s)
        {
            this.firstName = s;

            return this;
        }


        public Builder stationName(String sn)
        {
            this.stationName = sn;

            return this;

        }


        public AccessController build()
        {
            return new AccessController();
        }
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        AccessController that = (AccessController) object;

        if (employeeNumber != that.employeeNumber) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;
        if (!stationName.equals(that.stationName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + employeeNumber;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + stationName.hashCode();
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "AccessController{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", stationName='" + stationName + '\'' +
                '}';
    }


}
