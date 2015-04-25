package railApplication.Domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class AccessController implements Serializable{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String  employeeNumber;
    private String firstName;
    private String lastName;
    private String stationName;


    private AccessController()
    {}

    public Long getId() {
        return id;
    }
    public String  getEmployeeNumber() {
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
        this.id             = builder.id;
    }


    public static class Builder
    {

        private String employeeNumber;
        private String firstName;
        private String lastName;
        private String stationName;
        private Long id;


        public Builder(String  e)
        {
            this.employeeNumber = e;

        }

        public Builder id(Long id)
        {
            this.id  = id;
            return this;
        }

        public Builder lastName(String n)
        {
            this.lastName = n;

            return this;
        }


        public Builder firstName(String s)
        {
            this.firstName = s;

            return this;
        }


        public Builder stationName(String sn)
        {
            this.stationName = sn;

            return this;

        }

        public Builder copy(AccessController controller)
        {
            
            this.employeeNumber = controller.getEmployeeNumber();
            this.firstName = controller.getFirstName();
            this.lastName  = controller.getLastName();
            this.id        = controller.getId();
            this.stationName   = controller.getStationName();

            return this;

        }


        public AccessController build()
        {
            return new AccessController(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccessController that = (AccessController) o;

        if (employeeNumber != null ? !employeeNumber.equals(that.employeeNumber) : that.employeeNumber != null)
            return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (stationName != null ? !stationName.equals(that.stationName) : that.stationName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (employeeNumber != null ? employeeNumber.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (stationName != null ? stationName.hashCode() : 0);
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
