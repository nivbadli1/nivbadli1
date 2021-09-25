public class Birthday extends Event{


    public Birthday(Celebrator celebrator, int numOfCelebartors, int eventDay, int eventMonth, int eventYear) {
        super(celebrator, numOfCelebartors, eventDay, eventMonth, eventYear);
    }

    public int GetAgeCelebrator()
    {
        return (2021- (celebrator.getcClebratorBornYear()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birthday)) return false;
        if (!super.equals(o)) return false;
        Birthday birthday = (Birthday) o;
        return (this.celebrator.equals(birthday.celebrator));
    }



    @Override
    public String toString() {
        return "Birthday{" +
                "EventType=" + getClass().getSimpleName() +
                ", celebratorAge=" + this.GetAgeCelebrator() +
                ", celebratorName=" + celebrator.getCelebratorFirstName() + " " + celebrator.getCelebratorLastName() +
                ", celebratorID=" + celebrator.getCelebratorId() +
                ", getNumOfCelebrators=" + this.getNumOfCelebrators() +
                '}';
    }
}
