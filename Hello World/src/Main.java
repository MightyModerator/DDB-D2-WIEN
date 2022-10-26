public class Main {
    public static void main(String[] args) {
        String name = "Michael";
        String job = "Bankräuber";
        String adresse = "Wienerstraße 102/5";
        String pkw = "63S Carbon";
        System.out.println("Bastard");
        showgreeting();
// Test mit fixen Variablen


            System.out.println("Ich heisse " + name + "Mein Beruf ist " + job + ".Ich meine Adresse ist:" + adresse + "Ich komme im " + pkw);

        showgreeting(10);
        showgreeting(20);

    }

        public static void showgreeting(Integer hour) {;
            if (hour <= 12) {
                System.out.println("Moin");

            } else {
                if (hour < 19) {
                    System.out.println("Mahlzeit");

                } else
                    System.out.println("Nabend");
            }