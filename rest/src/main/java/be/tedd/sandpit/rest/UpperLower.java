package be.tedd.sandpit.rest;

public class UpperLower {

    private final long id;
    private final String original;
    private final String upper;
    private final String lower;

    public UpperLower(long id, String original) {
        this.id = id;
        this.original = original;
        this.upper = original.toUpperCase();
        this.lower = original.toLowerCase();
    }

    public long getId() {
        return id;
    }

    public String getOriginal() {
        return original;
    }

    public String getUpper() {
        return upper;
    }

    public String getLower() {
        return lower;
    }
}
