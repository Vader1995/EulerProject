package net.jarydrester.euler.models;

public abstract class Problem {

    private final int problemNumber;
    private final int summaryResourceId;
    private final int description;

    public Problem(int problemNumber, int summaryId, int description) {
        this.problemNumber = problemNumber;
        this.summaryResourceId = summaryId;
        this.description = description;
    }

    public int getProblemNumber() {
        return problemNumber;
    }

    public int getSummary() {
        return summaryResourceId;
    }

    public abstract String solve(String input);

    public int getDescription() {
        return description;
    }
}
