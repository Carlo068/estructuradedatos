/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 24/02/2025
*/

public class SalesWithDiscount {
    public double totalWithDiscount(double[] sales) {
        double total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += (sales[i] * 0.9);
        }
        return total;
    }
}