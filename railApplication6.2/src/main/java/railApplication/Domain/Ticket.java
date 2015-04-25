package railApplication.Domain;

import javax.persistence.*;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private int ticketNumber;
    private String classType;
    private String type;
    private String departLocation;
    private String destLocation;

    private Ticket()
    {

    }

    public Long getId() {
        return id;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getClassType() {
        return classType;
    }

    public String getType() {
        return type;
    }

    public String getDepartLocation() {
        return departLocation;
    }

    public String getDestLocation() {
        return destLocation;
    }

    public Ticket(Builder builder)
    {
        this.ticketNumber = builder.ticketNumber;
        this.type         = builder.type;
        this.classType    = builder.classType;
        this.departLocation = builder.departLocation;
        this.destLocation   = builder.destLocation;
        this.id             = builder.id;
    }



    public static class Builder
    {

        private int ticketNumber;
        private String classType;
        private String type;
        private String departLocation;
        private String destLocation;
        private Long id;

        public Builder(int n)
        {
            this.ticketNumber = n;
        }

        public Builder type(String t)
        {
            this.type  = t;

            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder classType(String t)
        {
            this.classType = t;
            return this;
        }

        public Builder departLocation(String d)
        {
            this.departLocation = d;
            return this;
        }

        public Builder destLocation(String d)
        {
            this.destLocation = d;
            return this;
        }

        public Ticket build()
        {
            return new Ticket(this);
        }

    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Ticket ticket = (Ticket) object;

        if (ticketNumber != ticket.ticketNumber) return false;
        if (!classType.equals(ticket.classType)) return false;
        if (!departLocation.equals(ticket.departLocation)) return false;
        if (!destLocation.equals(ticket.destLocation)) return false;
        if (!type.equals(ticket.type)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ticketNumber;
        result = 31 * result + classType.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + departLocation.hashCode();
        result = 31 * result + destLocation.hashCode();
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", classType='" + classType + '\'' +
                ", type='" + type + '\'' +
                ", departLocation='" + departLocation + '\'' +
                ", destLocation='" + destLocation + '\'' +
                '}';
    }
}
