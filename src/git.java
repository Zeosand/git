public class git {
    public static void main(String[] args) {
        System.out.println("Spooky Month");
        System.out.println("It is october");
        boolean halloween = false;
        int todaysDate = 25;
        while (todaysDate != 31) {
            todaysDate++;
            if (todaysDate == 31) {
                halloween = true;
            } if (halloween){
                System.out.println("Happy Halloween!");
            } else {
                System.out.println("Its not halloween yet." );
                System.out.println("Today is October " + todaysDate);
            }
        }
        System.out.println("Christmas is coming soon");
    }
}
