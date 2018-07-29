package core;

import core.enums.UpdateType;

public class Blackboard {
    private String solution;

    public Blackboard () {
        solution = "No solution.";
    }

    public void updateSolution(String newInfo, UpdateType type) {
        switch (type) {
            case ADD:
                solution += newInfo;
                break;
            case REPLACE:
                solution = newInfo;
                break;
        }
    }

    public String getSolution() {
        return solution;
    }
}
