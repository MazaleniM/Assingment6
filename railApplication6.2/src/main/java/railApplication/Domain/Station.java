package railApplication.Domain;

import javax.persistence.*;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @Column(unique = true)
    private int stationNumber;
    private String stationName;
    private int numberOfPlatforms;
    private int numberOfControllers;


    private Station()
    {}

    public Station (Builder builder)
    {
        this.stationNumber = builder.stationNumber;
        this.stationName   = builder.stationName;
        this.numberOfControllers = builder.numberOfControllers;
        this.numberOfPlatforms   = builder.numberOfPlatforms;
        this.id                  = builder.id;
    }
    public Long getId() {
        return id;
    }
    public int getStationNumber() {
        return stationNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public int getNumberOfControllers() {
        return numberOfControllers;
    }

    public static class Builder
    {

        private int stationNumber;
        private String stationName;
        private int numberOfPlatforms;
        private int numberOfControllers;
        private Long id;

        public Builder(int s)
        {
            this.stationNumber = s;
        }

        public Builder stationName(String n)
        {
            this.stationName = n;

            return this;
        }


        public Builder numberOfPlatforms(int p)
        {
            this.numberOfPlatforms = p;

            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder numberOfControllers(int c)
        {
            this.numberOfControllers = c;

            return this;
        }

        public Station build()
        {
            return new Station (this);
        }

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Station station = (Station) object;

        if (numberOfControllers != station.numberOfControllers) return false;
        if (numberOfPlatforms != station.numberOfPlatforms) return false;
        if (stationNumber != station.stationNumber) return false;
        if (!stationName.equals(station.stationName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + stationNumber;
        result = 31 * result + stationName.hashCode();
        result = 31 * result + numberOfPlatforms;
        result = 31 * result + numberOfControllers;
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Station{" +
                "stationNumber=" + stationNumber +
                ", stationName='" + stationName + '\'' +
                ", numberOfPlatforms=" + numberOfPlatforms +
                ", numberOfControllers=" + numberOfControllers +
                '}';
    }


}
