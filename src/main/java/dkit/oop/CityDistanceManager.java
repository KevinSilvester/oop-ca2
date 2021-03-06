package dkit.oop;

public class CityDistanceManager {

    String cities[] = {"Dublin", "Belfast", "Cork", "Limerick", "Galway"};

    int[][] distances =
            {           // distances between the cities Dublin to Belfast is 167km
                    {0, 167, 257, 198, 219},
                    {167, 0, 424, 323, 306},
                    {257, 424, 0, 105, 209},
                    {198, 323, 105, 0, 105},
                    {219, 306, 209, 105, 0}
            };

    CityDistanceManager(){};    // constructor;

    // Q4.1
    public int findDistanceBetween(String city1, String city2) {
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i <= this.cities.length-1; i++) {
            if (city1.equals(this.cities[i]))
                rowIndex = i;
        }

        for (int i = 0; i <= this.cities.length-1; i++) {
            if (city2.equals(this.cities[i]))
                colIndex = i;
        }

        return this.distances[rowIndex][colIndex];
    }

    // Q4.2
    public String findClosestCityTo(String searchCity) {
        String resCity = null;
        int rowIndex = 0;
        int colIndex = 0;
        int distance = 10000000;

        for (int i = 0; i <= this.cities.length-1; i++) {
            if (searchCity.equals(this.cities[i]))
                rowIndex = i;
        }

        for (int i = 0; i <= this.distances[rowIndex].length-1; i++) {
            if (this.distances[rowIndex][i] > distance && this.distances[rowIndex][i] < 0)
                distance = this.distances[rowIndex][i];
        }

        return this.cities[rowIndex];
    }

    /////////////// no changes required below this comment ///////////////

    public  void printCitiesData() {
        System.out.printf("%-10s", "");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%10s", cities[i]);
        }
        System.out.println("");

        for (int i = 0; i < distances.length; i++) {
            System.out.printf("%-10s", cities[i]);

            for (int j = 0; j < distances.length; j++) {
                System.out.printf("%10d", distances[i][j]);
            }
            System.out.println("");
        }
    }
}
