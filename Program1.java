public class Program1 {

    static class Phone {
        public void call(String number) {
            System.out.println("Calling " + number);
        }
    }

    static class Browser {
        public void openWebsite(String url) {
            System.out.println("Opening website: " + url);
        }
    }

    static class Smartphone {
        private Phone phone;
        private Browser browser;

        public Smartphone() {
            phone = new Phone();
            browser = new Browser();
        }

        public void makeCall(String number) {
            phone.call(number);
        }

        public void browse(String url) {
            browser.openWebsite(url);
        }
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.makeCall("08123456789");
        smartphone.browse("www.google.com");
    }
}