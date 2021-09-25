import java.util.Objects;

public class Wedding extends Event{


    Celebrator celebrator2;

    public Wedding(Celebrator celebrator1,int numOfCelebartors, int eventDay, int eventMonth, int eventYear,Celebrator celebrator2) {
        super(celebrator1, numOfCelebartors, eventDay, eventMonth, eventYear);
        this.celebrator2 = celebrator2;
        super.celebrator = celebrator1;
         }




    //    @Override
//    public boolean equals(Wedding w) {
//        if (this == w) return true;
//        if (w == null || getClass() != w.getClass()) return false;
//        //return ( )
//        System.out.println(this.eventYear);
//        System.out.println(w.eventYear);
//        return (this.celebrator.equals(w.celebrator) || this.celebrator.equals(w.celebrator2)
//                && celebrator2.equals(w.celebrator) || celebrator2.equals(w.celebrator2) && this.eventYear == w.eventYear
//                 ) ;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wedding)) return false;
        if (!super.equals(o)) return false;
        Wedding wedding = (Wedding) o;
        return (this.celebrator.equals(wedding.celebrator) || this.celebrator.equals(wedding.celebrator2) && this.celebrator2.equals(wedding.celebrator) || this.celebrator2.equals(wedding.celebrator2 ));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), celebrator2);
    }

    @Override
    public String toString() {
        return "Wedding{" +
                "eventType= " + this.getClass().getSimpleName() + " " +
                "celebrator=" + this.celebrator2 +
                ", celebrator=" + this.celebrator +
                "numOfCelebrators=" + this.getNumOfCelebrators() +
                '}';
    }
}
