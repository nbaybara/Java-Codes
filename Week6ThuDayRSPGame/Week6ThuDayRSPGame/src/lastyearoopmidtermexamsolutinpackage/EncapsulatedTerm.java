
package lastyearoopmidtermexamsolutinpackage;

public class EncapsulatedTerm {

    private int day;  //day values should be between 1-7
    private int week; //day values should be between 1-8
    
    public void setDay(int day)
    {
        if(day<1 || day>7)
            throw new IllegalArgumentException("the value shoul be within 1-7");
        this.day =day;
    }
    
    public void setWeek(int week)
    {
         if(week<1 || week>8)
            throw new IllegalArgumentException("the value shoul be within 1-8");
        this.week =week;
    }
    
    public int getDay()
    {
        return day;
    }
    
    
    public int getWeek()
    {
        return week;
    }
}
