public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double hours = 6;
    double weeks = 17;
    double workdays = 5;
    System.out.println((hours*workdays*weeks)+ " hours is spent with coding in a semester by an attendee");
    double average = 52;
    System.out.println((hours*workdays*weeks)/(weeks*average)*100 + " %");
  }
}
