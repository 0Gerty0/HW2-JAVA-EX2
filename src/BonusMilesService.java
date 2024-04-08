public class BonusMilesService {
    public int calculate(int a) {
        int miles;
        if (a > 1000) {
            miles = a / 20;
        } else {
            miles = 0;
        }
        return miles;
    }
}