package board;

public class Square {
    private final File file;
    private final Rank rank;

    public Square(File file, Rank rank) {
        this.file = file;
        this.rank = rank;
    }

    public int getFile() {
        return this.file.ordinal();
    }

    public int getRank() {
        return this.rank.ordinal();
    }
}
