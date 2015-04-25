package railApplication.Domain;

import javax.persistence.*;
/**
 * Created by student on 2015/04/18.
 */
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private int trainNumber;
    private String travellingLine;
    private int numberOfCoaches;

    private Train()
    {}

    public Train (Builder builder)
    {
        this.trainNumber = builder.trainNumber;
        this.travellingLine = builder.travellingLine;
        this.numberOfCoaches = builder.numberOfCoaches;
        this.id              = builder.id;
    }
    public Long  getId() {
        return id;
    }
    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTravellingLine() {
        return travellingLine;
    }

    public int getNumberOfCoaches() {
        return numberOfCoaches;
    }


    public static class Builder
    {
        private int trainNumber;
        private String travellingLine;
        private int numberOfCoaches;
        private Long id;

        public Builder(int trainNumber)
        {
            this.trainNumber = trainNumber;


        }

        public Builder travellingLine(String line)
        {
            this.travellingLine = line;
            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder numberOfCoaches(int c)
        {
            this.numberOfCoaches = c;
            return this;
        }


        public Train build()
        {
            return new Train(this);
        }
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Train train = (Train) object;

        if (numberOfCoaches != train.numberOfCoaches) return false;
        if (trainNumber != train.trainNumber) return false;
        if (travellingLine != null ? !travellingLine.equals(train.travellingLine) : train.travellingLine != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + trainNumber;
        result = 31 * result + (travellingLine != null ? travellingLine.hashCode() : 0);
        result = 31 * result + numberOfCoaches;
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", travellingLine='" + travellingLine + '\'' +
                ", numberOfCoaches=" + numberOfCoaches +
                '}';
    }



}
