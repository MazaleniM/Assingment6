package railApplication.Domain;

import javax.persistence.*;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class TravellingLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private int lineNumber;
    private int numberOfStations;
    private String lineName;
    private int numberOfTrains;


    private TravellingLine()
    {

    }

    public Long getId() {
        return id;
    }
    public int getLineNumber() {
        return lineNumber;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public String getLineName() {
        return lineName;
    }

    public int getNumberOfTrains() {
        return numberOfTrains;
    }

    public TravellingLine(Builder builder)
    {
        this.lineName = builder.lineName;
        this.numberOfStations = builder.numberOfStations;
        this.lineNumber = builder.lineNumber;
        this.numberOfTrains = builder.numberOfTrains;
        this.id             = builder.id;
    }

    public static class Builder
    {

        private int lineNumber;
        private int numberOfStations;
        private String lineName;
        private int numberOfTrains;
        private Long id;


        public Builder(int num)
        {
            this.lineNumber = num;
        }

        public Builder numberOfTrains(int num)
        {
            this.numberOfTrains = num;

            return this;
        }


        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder numberOfStations(int num)
        {
            this.numberOfStations = num;
            return this;
        }

        public Builder lineName(String n)
        {
            this.lineName = n;

            return this;
        }


        public Builder copy(TravellingLine line)
        {
            this.id = line.getId();
            this.lineName = line.getLineName();
            this.lineNumber  = line.getLineNumber();
            this.numberOfStations = line.getNumberOfStations();
            this.numberOfTrains    = line.getNumberOfTrains();

            return this;
        }

        public TravellingLine build()
        {
            return new TravellingLine(this);
        }

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TravellingLine that = (TravellingLine) object;

        if (lineNumber != that.lineNumber) return false;
        if (numberOfStations != that.numberOfStations) return false;
        if (numberOfTrains != that.numberOfTrains) return false;
        if (!lineName.equals(that.lineName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + lineNumber;
        result = 31 * result + numberOfStations;
        result = 31 * result + lineName.hashCode();
        result = 31 * result + numberOfTrains;
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TravellingLine{" +
                "lineNumber=" + lineNumber +
                ", numberOfStations=" + numberOfStations +
                ", lineName='" + lineName + '\'' +
                ", numberOfTrains=" + numberOfTrains +
                '}';
    }


}
