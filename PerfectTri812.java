class PerfectTi812 {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];

                    // cross product of (p2-p1) and (p3-p1)
                    long cross = (long)(x2 - x1) * (y3 - y1) - (long)(x3 - x1) * (y2 - y1);

                    double area = Math.abs(cross) / 2.0;
                    if (area > maxArea) maxArea = area;
                }
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        PerfectTi812 sol = new PerfectTi812();

        // Example input
        int[][] points = { {0,0}, {0,1}, {1,0}, {0,2}, {2,0} };

        double result = sol.largestTriangleArea(points);
        System.out.println("Largest Triangle Area = " + result);
    }
}
    