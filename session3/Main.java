public class Main {

    // Exactly 500 pages is not fatiguing because the task says "over 500", so I used > not >=.
    static int readingTime(int pages) {
        int minutes = pages * 2;
        if (pages > 500) {
            minutes = minutes + minutes / 10;
        }
        return minutes;
    }

    public static void main(String[] args) {
        int[] books = {100, 500, 800};
        for (int pages : books) {
            System.out.println(pages + " pages -> " + readingTime(pages) + " min");
        }
    }
}
