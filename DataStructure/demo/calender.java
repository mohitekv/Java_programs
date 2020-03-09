//package demo;
public class calender {
    public static int day(int month, int day, int year) {
        int y = year - ((14 - month) / 12);
        int x = y + (y / 4 - y / 100 + y / 400);
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;
    }

    public static void main(String arg[]) {
        int d = day(4, 1, 2020);
        System.out.println(d);
    }

}
// y0​ = ​ y ​ − (14 − ​ m ) ​ / 12
// x ​ = ​ y0​ ​ + ​ y ​ 0​ /4 − ​ y 0​ ​ /100 + ​ y ​ 0​ /400
// m ​ 0​ = ​ m ​ + 12 × ((14 − ​ m ​ ) / 12) − 2
// d ​ 0​ = (​ d ​ + ​ x ​ + 31​ m ​ 0​ / 12) mod 7