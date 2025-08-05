
class Daily3477 {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] usedFruits = new boolean[n];
        int unplacedFruits = 0;

        for (int i = 0; i < n; i++) {
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (baskets[j] >= fruits[i] && !usedFruits[j]) {
                    usedFruits[j] = true;
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                unplacedFruits++;
            }
        }
        return unplacedFruits;

    }
}
