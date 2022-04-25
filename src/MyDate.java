public class MyDate {
    int day; //initializing reference variables for Main()
    int month;
    int year;

    { //Initialization block that sets a 'default' date when ever an object is initialized, the no-args constructor will allow the use of this information
        day = 1;
        month = 1;
        year = 2000;
    }
    public MyDate (){} //no-args constructor

    public MyDate(int m, int d, int y) //constructor with three argumentative parameters
    {
        setDate(m, d, y);
    }

    public String toString() //method to print to the user
    {
        String date = month + "/" + day + "/" + year;

        return date;
    }

    public void setDate(int m, int d, int y) //method that sets the behaviour to set the date
    {
        month = m;
        day = d;
        year = y;
    }

}
