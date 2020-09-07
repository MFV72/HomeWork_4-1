public class BonusMilesService {
    public int calculate(int cost) {
        int count = 20; // количество рублей за 1 милю
        int totalMiles = cost / count;
        return totalMiles;
    }
}
