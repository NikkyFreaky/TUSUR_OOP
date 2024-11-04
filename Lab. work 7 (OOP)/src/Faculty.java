public class Faculty {
    String Room;
    String NameFaculty;
    String Corps;
    String Telephone;
    String NameDean;

    public Faculty(String NameFaculty, String Corps, String Room, String Telephone, String NameDean) {
        this.NameFaculty = NameFaculty;
        this.Room = Room;
        this.Corps = Corps;
        this.Telephone = Telephone;
        this.NameDean = NameDean;
    }

    @Override
    public String toString() {
        return "\n{Факультет: " + NameFaculty + "\nКорпус: " + Corps + "\nАудитория: " + Room + "\nКонтактный телефон: " + Telephone + "\nФамилия декана: " + NameDean + "}\n";
    }
}
