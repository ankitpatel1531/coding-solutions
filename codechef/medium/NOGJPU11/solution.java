class AverageScoreCalculator {
    public static void main(String[] args) {
        String studentName = "Alex";
        
        float anciantRunesScore = 88.5f;
        float potionScore = 91.25f;
        
        float averageScore = (anciantRunesScore+potionScore)/2;
        
        System.out.println("Student: "+studentName);
        System.out.println("Ancient Runes Score: "+ anciantRunesScore);
        System.out.println("Potions Score: "+ potionScore);
        System.out.println("Average Score: "+averageScore);
        
    }
}