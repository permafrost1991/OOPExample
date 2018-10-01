/*
* An enum type is a special data type that enables for a variable to be a set of predefined
* constants. The variable must be equal to one of the values that have been predefined for it.
* Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days
* of the week.
*
* Because they are constants, the names of an enum type's fields are in uppercase letters.
 */



package EnumPackage;

public class EnumTest {
  Day day;

  public EnumTest(Day day) {
    this.day = day;
  }

  public void tellItLikeItIs() {
    switch (day) {
      case MONDAY:
        System.out.println("Mondays are bad.");
        break;

      case FRIDAY:
        System.out.println("Fridays are better.");
        break;

      case SATURDAY: case SUNDAY:
        System.out.println("Weekends are best.");
        break;

      default:
        System.out.println("Midweek days are so-so.");
        break;
    }
  }

  public static void main(String[] args) {
    EnumTest firstDay = new EnumTest(Day.MONDAY);
    firstDay.tellItLikeItIs();
    EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
    thirdDay.tellItLikeItIs();
    EnumTest fifthDay = new EnumTest(Day.FRIDAY);
    fifthDay.tellItLikeItIs();
    EnumTest sixthDay = new EnumTest(Day.SATURDAY);
    sixthDay.tellItLikeItIs();
    EnumTest seventhDay = new EnumTest(Day.SUNDAY);
    seventhDay.tellItLikeItIs();
  }
}