package railApplication.Domain;

import javax.persistence.*;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Commuter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String  commuterNumber;
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
        this.id             = builder.id;
    }
    public Long getId() {
        return id;
    }
    public String getCommuterNumber() {
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
        private String commuterNumber;
        private String lastName;
        private String firstName;
        private String contactNum;
        private Long id;

        public Builder(String c)
        {
            this.commuterNumber = c;
        }

        public Builder firstName(String n)
        {
            this.firstName = n;

            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;

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

        public Builder copy(Commuter commuter)
        {
            this.commuterNumber = commuter.getCommuterNumber();
            this.contactNum     = commuter.getContactNum();
            this.firstName      = commuter.getFirstName();
            this.lastName       = commuter.getLastName();
            this.id             = commuter.getId();

            return this;
        }

        public Commuter build ()
        {
            return new Commuter(this);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commuter commuter = (Commuter) o;

        if (commuterNumber != null ? !commuterNumber.equals(commuter.commuterNumber) : commuter.commuterNumber != null)
            return false;
        if (contactNum != null ? !contactNum.equals(commuter.contactNum) : commuter.contactNum != null) return false;
        if (firstName != null ? !firstName.equals(commuter.firstName) : commuter.firstName != null) return false;
        if (id != null ? !id.equals(commuter.id) : commuter.id != null) return false;
        if (lastName != null ? !lastName.equals(commuter.lastName) : commuter.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commuterNumber != null ? commuterNumber.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (contactNum != null ? contactNum.hashCode() : 0);
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