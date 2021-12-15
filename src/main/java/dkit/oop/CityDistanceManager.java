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
        // write code here
        return 0;
    }

    // Q4.2
    public String findClosestCityTo(String searchCity) {
        // write code here
        return "unknown";
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
