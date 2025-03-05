package day1.college;

public class Hosteller extends Student{

    private int roomNumber;
    private char blockName;
    private String roomType;

    public int getRoomNumber() {
        return roomNumber;
    }

    public char getBlockName() {
        return blockName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBlockName(char blockName) {
        this.blockName = blockName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Hosteller(int studentId, String studentName, String department, String gender, String category, double collegeFee, int roomNumber, char blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }


    @Override
    public double calculateTotalFee() {

        double hostelFee=0;

        if(this.blockName=='A')
        {
            hostelFee=60000;
            if(this.roomType.equals("AC"))
            {
                hostelFee += 8000;
            }
        }

        else if(this.blockName=='B')
        {
            hostelFee=50000;
            if(this.roomType.equals("AC"))
            {
                hostelFee += 5000;
            }
        }

        else if(this.blockName=='C')
        {
            hostelFee=40000;
            if(this.roomType.equals("AC"))
            {
                hostelFee += 2500;
            }
        }



        return this.getCollegeFee() + hostelFee;
    }
}
