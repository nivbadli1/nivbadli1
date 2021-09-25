import java.util.Date;
import java.util.Objects;

public class Celebrator {

    String celebratorFirstName;
    String celebratorLastName;
    String celebratorId;
    int celebratorBornYear;

    public Celebrator(String celebratorFirstName, String celebratorLastName, String celebratorId, int celebratorBornYear) {
        this.celebratorFirstName = celebratorFirstName;
        this.celebratorLastName = celebratorLastName;
        this.celebratorId = celebratorId;
        this.celebratorBornYear = celebratorBornYear;
    }

    public Celebrator(Celebrator other) {
        other.celebratorFirstName = this.celebratorFirstName;
        other.celebratorLastName = this.celebratorLastName;
        other.celebratorId = this.celebratorId;
        other.celebratorBornYear = this.celebratorBornYear;
    }


    public String getCelebratorFirstName() {
        return celebratorFirstName;
    }

    public String getCelebratorLastName() {
        return celebratorLastName;
    }

    public String getCelebratorId() {
        return celebratorId;
    }

    public int getcClebratorBornYear() {
        return celebratorBornYear;
    }

    public boolean equals(Celebrator o) {
        return this.celebratorId.equals(o.celebratorId);
    }

    @Override
    public String toString() {
        return "Celebrator{" +
                "celebratorFirstName='" + celebratorFirstName + '\'' +
                ", celebratorLastName='" + celebratorLastName + '\'' +
                ", celebratorId='" + celebratorId + '\'' +
                '}';
    }
}
