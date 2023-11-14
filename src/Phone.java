public class Phone {

    /*
     * writing nothing or public are the same
     * private - only the class can acces it (in this case the phone class)
     * protected - same thing but subclasses can access it too
     * public - everyone can acces and change it
     */
    private String manufacturer;
    protected String model;
    public int year;
    int price;
    private final String[] manuName = new String[]{"Apple", "Google", "Samsung"};
    /**
     * if we do not set a variable (e.g int a = 5)
     * the variables will be the next:
     * String -> null
     * int, double, float -> 0
     * boolean -> false
     * any other class -> null
     */

    public Phone(int manuId, String m, int year, int price) {
        if(manuId < manuName.length){
            this.manufacturer = manuName[manuId];
        }
        this.model = m;
        this.year = year;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
