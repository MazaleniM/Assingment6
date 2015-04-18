package railApplication.Domain;

/**
 * Created by student on 2015/04/18.
 */
public class Commuter {

    //@Id
   // @GeneratedValue(GenerationType.AUTO)
    private int commuterNumber;
    private String lastName;
    private String firstName;
    private String contactNum;

    private Commuter()
    {}

    public Commuter(Builder builder)
    {
        this.commuterNumber = builder.commuterNumber;
        this.contactNum     = builder.contactNum;
        this.firstName      = builder.firstName;
        this.lastName       = builder.lastName;
    }

    public int getCommuterNumber() {
        return commuterNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getContactNum() {
        return contactNum;
    }


    public static class Builder
    {
        private int commuterNumber;
        private String lastName;
        private String firstName;
        private String contactNum;

        public Builder(int c)
        {
            this.commuterNumber = c;
        }

        public Builder firstName(String n)
        {
            this.firstName = n;

            return this;
        }

        public Builder lastName(String s)
        {
            this.lastName = s;

            return this;
        }

        public Builder contactNumber(String c)
        {
            this.contactNum = c;

            return this;
        }

        public Commuter build ()
        {
            return new Commuter(this);
        }

    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Commuter commuter = (Commuter) object;

        if (commuterNumber != commuter.commuterNumber) return false;
        if (!contactNum.equals(commuter.contactNum)) return false;
        if (!firstName.equals(commuter.firstName)) return false;
        if (!lastName.equals(commuter.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + commuterNumber;
        result = 31 * result + lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + contactNum.hashCode();
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Commuter{" +
                "commuterNumber=" + commuterNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", contactNum='" + contactNum + '\'' +
                '}';
    }

}